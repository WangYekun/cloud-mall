package com.mall.product.dao;

import com.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 14:58:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
