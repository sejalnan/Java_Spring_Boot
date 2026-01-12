package com.boot.food.service;
import com.boot.food.Exception.OrderNotFound;
import com.boot.food.Interface.OrderService;
import com.boot.food.model.Order;
import com.boot.food.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl  implements OrderService {

    private final OrderRepository repository;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order createOrder(Order order) {
        Order newOrder=new Order(order.getAmount(),order.getProductId(),order.getQuantity(),order.getStatus());
        repository.save(newOrder);
        return newOrder;
    }

    @Override
    public List<Order> getAllOrders() {
        return repository.findAllOrders();
    }

    @Override
    public Order getOrderById(String id) {
        return repository.findOrderById(id);
    }


    @Override
    public Order updateOrderById(String id, Order order) {
        try
        {
            repository.updateById(id, order);

        }
        catch (OrderNotFound e)
        {
            throw e;
        }
        return order;
    }




//    public Order cancelOrder(String OrderId) {
//        return null;
//    }


}
