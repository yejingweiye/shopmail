package com.example.shopmail.shopmailcoupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopmail.shopmailcoupon.entity.HomeAdvEntity;
import com.example.shopmail.shopmailcoupon.service.HomeAdvService;
import com.example.common.utils.PageUtils;
import com.example.common.utils.R;



/**
 * 首页轮播广告
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 16:40:13
 */
@RestController
@RequestMapping("shopmailcoupon/homeadv")
public class HomeAdvController {
    @Autowired
    private HomeAdvService homeAdvService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//  @RequiresPermissions("shopmailcoupon:homeadv:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeAdvService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("shopmailcoupon:homeadv:info")
    public R info(@PathVariable("id") Long id){
		HomeAdvEntity homeAdv = homeAdvService.getById(id);

        return R.ok().put("homeAdv", homeAdv);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("shopmailcoupon:homeadv:save")
    public R save(@RequestBody HomeAdvEntity homeAdv){
		homeAdvService.save(homeAdv);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("shopmailcoupon:homeadv:update")
    public R update(@RequestBody HomeAdvEntity homeAdv){
		homeAdvService.updateById(homeAdv);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("shopmailcoupon:homeadv:delete")
    public R delete(@RequestBody Long[] ids){
		homeAdvService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
