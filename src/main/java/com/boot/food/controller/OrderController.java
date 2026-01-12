package com.boot.food.controller;

import com.boot.food.Exception.OrderNotFound;
import com.boot.food.Interface.OrderService;
import com.boot.food.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/Order")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        try{
            return new ResponseEntity <> (service.createOrder(order), HttpStatus.CREATED);
        } catch (OrderNotFound e) {
            System.out.println(e);
            return ResponseEntity.badRequest().build();
        }

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Order>> getAllOrders(){
        try{
            return ResponseEntity.ok(service.getAllOrders());
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable String id){
        try{
            return ResponseEntity.ok(service.getOrderById(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrderById(@PathVariable String id,@RequestBody Order order){
        try{

            return ResponseEntity.ok(service.updateOrderById(id,order));
        } catch (OrderNotFound e) {

            return ResponseEntity.notFound().build();
        }

    }



//    cancelOrder();


}
