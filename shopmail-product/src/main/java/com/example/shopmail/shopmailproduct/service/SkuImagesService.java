package com.example.shopmail.shopmailproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.shopmailproduct.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 15:00:37
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

