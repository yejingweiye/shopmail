package com.example.shopmail.shopmailproduct.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.example.common.valid.AddGroup;
import com.example.common.valid.UpdateGroup;
import com.example.common.valid.UpdateStatusGroup;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.shopmail.shopmailproduct.entity.BrandEntity;
import com.example.shopmail.shopmailproduct.service.BrandService;
import com.example.common.utils.PageUtils;
import com.example.common.utils.R;

import javax.validation.Valid;


/**
 * 品牌
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 15:00:37
 */
@RestController
@RequestMapping("shopmailproduct/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//  @RequiresPermissions("shopmailproduct:brand:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("shopmailproduct:brand:info")
    public R info(@PathVariable("brandId") Long brandId) {
        BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@Validated({AddGroup.class}) @RequestBody /*@Valid*/ BrandEntity brand/*, BindingResult result*/) {
        System.out.println("进入不合法的内容" + brand);
//        if(result.hasErrors()){
//            Map<String,String> map = new HashMap<>();
//            //获取校验的错误结果
//            result.getFieldErrors().forEach((item)->{
//                //FiledError
//                String message = item.getDefaultMessage();
//                //获取错误字段名
//                String field = item.getField();
//                map.put(field,message);
//            });
//
//            return R.error(400,"提交的数据不合法").put("data",map);
//        }else{
//
//        }
        brandService.save(brand);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R updateStatus(@Validated({UpdateGroup.class}) @RequestBody BrandEntity brand) {
        brandService.updateDetail(brand);

        return R.ok();
    }

    /**
     * 修改状态
     */
    @RequestMapping("/update/status")
    public R update(@Validated({UpdateStatusGroup.class}) @RequestBody BrandEntity brand) {
        brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("shopmailproduct:brand:delete")
    public R delete(@RequestBody Long[] brandIds) {
        brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
