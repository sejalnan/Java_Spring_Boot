package com.boot.food.repository;

import com.boot.food.Exception.OrderNotFound;
import com.boot.food.Exception.ProductNotFound;
import com.boot.food.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class OrderRepository {
    private final ArrayList<Order> list = new ArrayList<Order>();

    public List<Order> findAllOrders(){
        return list;
    }

    public Order findOrderById(String id){
        return list.stream().filter
                (p->p.getOrderId()== id).findFirst().orElse(null);

    }
    public void save(Order order){
        list.add(order);
    }
    public boolean updateById(String id,Order order){
        Order existingOrder=findOrderById(id);
        if(existingOrder!=null){
            existingOrder.setAmount(order.getAmount());
            existingOrder.setpId(order.getpId());
            existingOrder.setQuantity(order.getQuantity());
            existingOrder.setStatus(order.getStatus());

            return true;
        }else{
            throw new OrderNotFound("Order Not Fouund");
        }
    }


}