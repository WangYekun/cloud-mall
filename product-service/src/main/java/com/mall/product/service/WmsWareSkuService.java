package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.WmsWareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:45
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

