package com.mxz.supermarket.model;

import java.util.Date;

public class Orders {

    private Integer orderId;

    private String orderName;

    private Date orderTime;

    private Integer orderStatus;

    private String typeName;

    private String productName;

    private Double salePrice;

    private String remark1;

    private String remark2;

    public Orders() {
    }

    public Orders(String orderName, Date orderTime, Integer orderStatus, Double salePrice, String productName, String typeName) {
        this.orderName = orderName;
        this.orderTime = orderTime;
        this.orderStatus = orderStatus;
        this.salePrice = salePrice;
        this.productName = productName;
        this.typeName = typeName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderName=").append(orderName);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", productName=").append(productName);
        sb.append(", typeName=").append(typeName);
        sb.append("]");
        return sb.toString();
    }
}