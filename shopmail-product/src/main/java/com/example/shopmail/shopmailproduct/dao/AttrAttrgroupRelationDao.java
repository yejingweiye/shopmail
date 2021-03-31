package com.example.shopmail.shopmailproduct.dao;

import com.example.shopmail.shopmailproduct.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性&属性分组关联
 * 
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 15:00:37
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {

    void deleteBatchRelaion(@Param("entities") List<AttrAttrgroupRelationEntity> entities);

}
