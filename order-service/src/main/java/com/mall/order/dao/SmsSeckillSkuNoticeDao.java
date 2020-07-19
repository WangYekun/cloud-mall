package com.mall.order.dao;

import com.mall.order.entity.SmsSeckillSkuNoticeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 * 
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 15:31:39
 */
@Mapper
public interface SmsSeckillSkuNoticeDao extends BaseMapper<SmsSeckillSkuNoticeEntity> {
	
}
