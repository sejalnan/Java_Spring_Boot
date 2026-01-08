package com.spring.food_delivery_application;
import com.spring.food_delivery_application.config.AnnotationConfig;
import com.spring.food_delivery_application.config.AppConfig;
import com.spring.food_delivery_application.delivery.DeliveryPartner;
import com.spring.food_delivery_application.order.Order;
import com.spring.food_delivery_application.restaurant.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodDeliveryApplication {

    public static void main(String[] args) {

        //XML
        ApplicationContext ctx1=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Order order1=ctx1.getBean(Order.class);
        order1.show();


        //Java Object
        ApplicationContext ctx2=
                new AnnotationConfigApplicationContext(AppConfig.class);
        DeliveryPartner partner1=ctx2.getBean(DeliveryPartner.class);
        partner1.showName();


        //Annotation
        ApplicationContext ctx3=
                new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Restaurant restaurant = ctx3.getBean(Restaurant.class);
        restaurant.setRname("Comfort Food Restaurant");
        restaurant.showRestaurant();

        DeliveryPartner partner2=ctx2.getBean(DeliveryPartner.class);
        partner2.setDpName("Shreya");
        partner2.showName();


    }

}
