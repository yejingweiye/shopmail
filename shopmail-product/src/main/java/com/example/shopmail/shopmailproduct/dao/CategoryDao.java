package com.example.shopmail.shopmailproduct.dao;

import com.example.shopmail.shopmailproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 15:00:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
