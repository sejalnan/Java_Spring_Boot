package com.boot.food.model;
public class FoodProduct {
    private int pid;
    private String pname;
    private String ptype;
    private float price;


    public FoodProduct(int pid, String pname, String ptype, float price) {
        this.pid = pid;
        this.pname = pname;
        this.ptype = ptype;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }
}
