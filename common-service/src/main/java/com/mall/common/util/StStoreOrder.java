package com.mall.common.util;

import lombok.Data;

import java.util.List;

/**
 * @author lenovo
 */
@Data
public class StStoreOrder {

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 所属经销商编号
     */
    private String distributorId;

    /**
     * 定制内容
     */
    private String customContent;

    /**
     * 客户姓名
     */
    private String customerName;

    private List<StStoreOrderDetail> stStoreOrderDetailList01;

    private List<StStoreOrderDetail> stStoreOrderDetailList02;

    private List<StStoreOrderDetail> stStoreOrderDetailList03;


}