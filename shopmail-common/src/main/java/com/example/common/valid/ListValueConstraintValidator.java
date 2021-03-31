package com.example.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

//注解：ListValue,校验字段的类型Integer
public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer>{
    private Set<Integer> set = new HashSet<>();
    //初始化方法
    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] vals = constraintAnnotation.vals();//拿到注解上所有的值，把它放进set中
        for(int val:vals){
            set.add(val);
        }


    }

    //判断是否校验成功
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        return set.contains(value);//注解上是否包含该值
    }
}
