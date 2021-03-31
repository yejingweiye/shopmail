package com.example.shopmail.shopmailorder.dao;

import com.example.shopmail.shopmailorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 18:36:39
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
