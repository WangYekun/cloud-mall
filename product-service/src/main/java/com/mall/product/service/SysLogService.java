package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.SysLogEntity;

import java.util.Map;

/**
 * 系统日志
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:51
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

