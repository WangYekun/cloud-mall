package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.SysMenuEntity;

import java.util.Map;

/**
 * 菜单管理
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:52
 */
public interface SysMenuService extends IService<SysMenuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

