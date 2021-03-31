package com.example.shopmail.shopmailware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.shopmailware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 18:45:08
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

