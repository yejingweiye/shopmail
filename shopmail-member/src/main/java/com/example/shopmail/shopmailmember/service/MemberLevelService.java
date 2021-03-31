package com.example.shopmail.shopmailmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.shopmailmember.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author yejingwei
 * @email yejingwei@gmail.com
 * @date 2020-09-12 17:01:21
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

