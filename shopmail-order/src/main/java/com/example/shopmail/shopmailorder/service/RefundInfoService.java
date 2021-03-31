package com.example.shopmail.shopmailorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.shopmailorder.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 18:36:39
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

