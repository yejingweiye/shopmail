package com.example.shopmail.shopmailproduct.exception;

import com.example.common.exception.BizCodeEnume;
import com.example.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Slf4j
//标注就是统一处理controller的异常的,basePackages是规定某一个包下的controller
//@ControllerAdvice(basePackages = "com.example.shopmail.shopmailproduct.controller")
//@ResponseBody
@RestControllerAdvice
public class ShopmailExceptionControllerAdvice {

    //返回值ModelAndView//这个表示跳转页面Exception.class表示所有的异常都处理
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
//    @ResponseBody
    public R handleValidException(MethodArgumentNotValidException e) {
        log.error("数据校验出现异常{},异常类型{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        Map<String, String> errorMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError) -> {
            String message = fieldError.getDefaultMessage();
            String filed = fieldError.getField();
            errorMap.put(filed, message);
        });
        return R.error(BizCodeEnume.VALID_EXCEPTION.getCode(), BizCodeEnume.VALID_EXCEPTION.getMsg()).put("data", errorMap);
    }

    @ExceptionHandler(value = Throwable.class)//精确匹配不行，走这个异常处理
    public R handleException(Exception e) {
        log.error("通用校验异常{},异常类型{}", e.getMessage(), e.getClass());

        return R.error(BizCodeEnume.VALID_EXCEPTION.getCode(), BizCodeEnume.VALID_EXCEPTION.getMsg());
    }
}
