package com.spring.food_application.model;

public class Order {
    private int orderId;
    private String OrderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        OrderName = orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", OrderName='" + OrderName + '\'' +
                '}';
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String orderName) {
        OrderName = orderName;
    }

}
