package com.spring.food_delivery_application.restaurant;
import com.spring.food_delivery_application.delivery.DeliveryPartner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    private String rname;


    public void showRestaurant(){
        System.out.println("Restaurant Name : "+rname);
    }


    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
}

