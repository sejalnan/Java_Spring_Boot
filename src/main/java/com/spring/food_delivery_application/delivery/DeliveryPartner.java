package com.spring.food_delivery_application.delivery;

import org.springframework.beans.factory.annotation.Autowired;



public class DeliveryPartner {

    private String dpName;
    private DeliveryPartner deliveryPartner;

    @Autowired
    public DeliveryPartner(DeliveryPartner deliveryPartner){
        this.deliveryPartner=deliveryPartner;
        deliveryPartner.showName();
    }

    public void setDpName(String dpName) {
        this.dpName = dpName;
    }

    public DeliveryPartner(String dpName) {
        this.dpName = dpName;
    }

    public void showName(){
        System.out.println("Delivery Partner Name :"+dpName);
    }

}
