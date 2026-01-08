package com.spring.food_application.controller;

import com.spring.food_application.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    private OrderService orderService;


    public void placeOrder(){

        System.out.println("Order placed successfully");

    }

@Autowired
    public void  OrderService(OrderService orderService){
        this.orderService=orderService;
        orderService.processOrder();
    }



}
