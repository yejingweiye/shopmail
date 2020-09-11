package com.example.shopmail.shopmailproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.shopmailproduct.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-11 20:35:24
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

