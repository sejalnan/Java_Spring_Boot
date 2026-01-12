package com.boot.food.model;

import java.util.UUID;

public class Order {
    private String orderId;
    private int ProductId;
    private int quantity;
    private double amount;
    private String status;


    public Order(String orderId, int productId, int quantity, double amount, String status) {
        this.orderId = orderId;
        ProductId = productId;
        this.quantity = quantity;
        this.amount = amount;
        this.status = status;
    }

    public Order(double amount, int productId, int quantity, String status) {
        this.amount = amount;
        ProductId = productId;
        this.quantity = quantity;
        this.status = status;
    }

    public Order(){

    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {

        return ProductId;
    }

    public void setProductId(int ProductId) {
        this.ProductId= ProductId;
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
