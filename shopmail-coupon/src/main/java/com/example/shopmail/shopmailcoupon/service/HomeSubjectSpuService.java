package com.example.shopmail.shopmailcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.shopmailcoupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 16:40:13
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

