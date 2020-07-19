package com.mall.common.util;

import lombok.Data;

import java.util.List;

/**
 * @author lenovo
 */
@Data
public class StStoreOrderDetail {

    /**
     * 明细id
     */
    private String orderDetailId;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 关联关系
     */
    private List<Course> courses;

}