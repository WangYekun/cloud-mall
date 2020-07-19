package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.SysCaptchaEntity;

import java.util.Map;

/**
 * 系统验证码
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:52
 */
public interface SysCaptchaService extends IService<SysCaptchaEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

