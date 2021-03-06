package com.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.order.entity.SmsCouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 15:31:40
 */
public interface SmsCouponService extends IService<SmsCouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

