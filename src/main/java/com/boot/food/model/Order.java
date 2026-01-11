package com.boot.food.model;

import java.util.UUID;

public class Order {
    private String orderId;
    private int pId;
    private int quantity;
    private double amount;
    private String status;



    public Order(double amount, int pId, int quantity, String status) {
        this.amount = amount;
        this.orderId = UUID.randomUUID().toString();
        this.pId = pId;
        this.quantity = quantity;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }
}
