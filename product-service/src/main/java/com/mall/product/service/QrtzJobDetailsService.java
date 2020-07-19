package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.QrtzJobDetailsEntity;

import java.util.Map;

/**
 * 
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:50
 */
public interface QrtzJobDetailsService extends IService<QrtzJobDetailsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

