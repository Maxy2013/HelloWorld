package com.spring.springboot.module.model;

public class PaymentOrderVO {
    /**
     * 用户唯一标识
     */
    private String userId;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 支付金额
     */
    private String paymentMoney;
    /**
     * 付款类型 1、找人代付 2、自己的账户支付
     */
    private String type;
    /**
     * 支付状态 1、未支付 2、待付款 3、订单超时 4、支付成功
     */
    private String status;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(String paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
