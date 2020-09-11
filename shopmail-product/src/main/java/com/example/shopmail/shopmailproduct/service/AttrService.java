package com.example.shopmail.shopmailproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.shopmailproduct.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-11 20:35:24
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

