package com.example.shopmail.shopmailmember.dao;

import com.example.shopmail.shopmailmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 17:01:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
