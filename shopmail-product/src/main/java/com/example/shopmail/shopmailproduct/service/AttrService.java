package com.example.shopmail.shopmailproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.shopmailproduct.entity.AttrEntity;
import com.example.shopmail.shopmailproduct.vo.AttrGroupRelationVo;
import com.example.shopmail.shopmailproduct.vo.AttrRespVo;
import com.example.shopmail.shopmailproduct.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 15:00:37
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

}

