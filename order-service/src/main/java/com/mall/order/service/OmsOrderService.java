package com.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.order.entity.OmsOrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 15:31:41
 */
public interface OmsOrderService extends IService<OmsOrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

