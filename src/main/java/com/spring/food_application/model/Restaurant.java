package com.spring.food_application.model;
public class Restaurant {

    private String rname;
    private String menuitem;
    private int price;

    public Restaurant(String rname, String menuitem, int price) {
        this.rname = rname;
        this.menuitem = menuitem;
        this.price = price;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getMenuitem() {
        return menuitem;
    }

    public void setMenuitem(String menuitem) {
        this.menuitem = menuitem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
