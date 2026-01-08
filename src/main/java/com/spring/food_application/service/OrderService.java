package com.spring.food_application.service;
import com.spring.food_application.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


        private OrderRepository orderRepository;
        private RestaurantService restaurantService;
        private DeliveryService deliveryService;

        @Autowired
        public void RestaurantService (RestaurantService restaurantService){
            this.restaurantService=restaurantService;
            restaurantService.prepareFood();
        }


        @Autowired
        public void DeliveryService (DeliveryService deliveryService){
            this.deliveryService=deliveryService;
            deliveryService.deliverOrder();


        }
        @Autowired
        public void OrderRepository(OrderRepository orderRepository){
            this.orderRepository=orderRepository;
            orderRepository.saveOrder();

        }

        public void processOrder(){

        }



    }
