package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.SysConfigEntity;

import java.util.Map;

/**
 * 系统配置信息表
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:51
 */
public interface SysConfigService extends IService<SysConfigEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

