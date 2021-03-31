package com.example.shopmail.shopmailproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.shopmailproduct.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 15:00:37
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

