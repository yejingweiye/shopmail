package com.example.shopmail.shopmailware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.shopmailware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 18:45:08
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

