package com.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.product.dao.SmsSeckillSkuRelationDao;
import com.mall.product.entity.SmsSeckillSkuRelationEntity;
import com.mall.product.service.SmsSeckillSkuRelationService;


@Service("smsSeckillSkuRelationService")
public class SmsSeckillSkuRelationServiceImpl extends ServiceImpl<SmsSeckillSkuRelationDao, SmsSeckillSkuRelationEntity> implements SmsSeckillSkuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSeckillSkuRelationEntity> page = this.page(
                new Query<SmsSeckillSkuRelationEntity>().getPage(params),
                new QueryWrapper<SmsSeckillSkuRelationEntity>()
        );

        return new PageUtils(page);
    }

}