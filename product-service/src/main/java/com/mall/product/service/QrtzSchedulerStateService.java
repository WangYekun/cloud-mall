package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.QrtzSchedulerStateEntity;

import java.util.Map;

/**
 * 
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:50
 */
public interface QrtzSchedulerStateService extends IService<QrtzSchedulerStateEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

