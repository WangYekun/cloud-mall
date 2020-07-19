package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.QrtzSimpleTriggersEntity;

import java.util.Map;

/**
 * 
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:51
 */
public interface QrtzSimpleTriggersService extends IService<QrtzSimpleTriggersEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

