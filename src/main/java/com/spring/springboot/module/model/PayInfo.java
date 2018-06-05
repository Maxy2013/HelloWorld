package com.spring.springboot.module.model;

import java.util.List;

public class PayInfo {
    /**
     * 支付时间
     */
    private String payDate;
    /**
     * 支付的商品种类
     * 1、大家电 2、服装 3、日化 4、零食 5、其他
     */
    private String goodsType;
    /**
     * 订单信息
     */
    private List<PaymentOrderVO> orderInfo;

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public List<PaymentOrderVO> getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(List<PaymentOrderVO> orderInfo) {
        this.orderInfo = orderInfo;


    }
}
