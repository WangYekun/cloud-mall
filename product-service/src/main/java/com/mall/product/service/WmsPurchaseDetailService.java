package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.WmsPurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:46
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

