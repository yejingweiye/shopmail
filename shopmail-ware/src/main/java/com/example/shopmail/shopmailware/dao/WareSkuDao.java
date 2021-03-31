package com.example.shopmail.shopmailware.dao;

import com.example.shopmail.shopmailware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 18:45:08
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
