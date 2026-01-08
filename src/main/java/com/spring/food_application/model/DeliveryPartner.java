package com.spring.food_application.model;

public class DeliveryPartner {

    private String pname;
    private String address;

    public DeliveryPartner(String pname, String address) {
        this.pname = pname;
        this.address = address;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeliveryPartner{" +
                "pname='" + pname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
