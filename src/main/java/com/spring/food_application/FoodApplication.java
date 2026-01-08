package com.spring.food_application;

import com.spring.food_application.config.AppConfig;
import com.spring.food_application.controller.OrderController;
import com.spring.food_application.model.DeliveryPartner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FoodApplication {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

       OrderController controller = ctx.getBean(OrderController.class);
        controller.placeOrder();

//        DeliveryPartner partner1=ctx.getBean(DeliveryPartner.class);
//        partner1.setAddress("Nagpur");
//        partner1.setPname("abc");
//        System.out.println(partner1.toString());



    }

}
