package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 13:50:51
 */
public interface SysOssService extends IService<SysOssEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

