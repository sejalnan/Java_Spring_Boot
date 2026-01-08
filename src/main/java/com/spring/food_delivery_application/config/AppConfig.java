package com.spring.food_delivery_application.config;
import com.spring.food_delivery_application.delivery.DeliveryPartner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {

    @Bean
    public DeliveryPartner deliveryPartner(){
        System.out.println("Order has been Delivered...");
        return new DeliveryPartner("Sejal");
    }

}
