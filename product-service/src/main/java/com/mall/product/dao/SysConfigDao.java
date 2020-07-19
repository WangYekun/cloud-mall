package com.mall.product.dao;

import com.mall.product.entity.SysConfigEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统配置信息表
 * 
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:51
 */
@Mapper
public interface SysConfigDao extends BaseMapper<SysConfigEntity> {
	
}
