package com.inheritance.vehicle;

public class Withgear extends Bike {

    private int customerId;
    private String bike_name;
   private String color;

   private  float price;

    public String getBike_name() {
        return bike_name;
    }

    public void setBike_name(String bike_name) {
        this.bike_name = bike_name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
