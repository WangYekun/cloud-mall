package com.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.order.entity.SmsSkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 15:31:39
 */
public interface SmsSkuLadderService extends IService<SmsSkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

