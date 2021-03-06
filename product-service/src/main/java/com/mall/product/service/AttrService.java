package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 14:58:11
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

