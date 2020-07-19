package com.mall.product.dao;

import com.mall.product.entity.SysUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户
 * 
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:52
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
	
}