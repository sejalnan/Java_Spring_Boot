package com.boot.food.Interface;

import com.boot.food.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    public Order getOrderById(String id );
    public List<Order> getAllOrders();
    public Order updateOrderById(String id, Order order);

    // public Order cancelOrder(String OrderId);


}
