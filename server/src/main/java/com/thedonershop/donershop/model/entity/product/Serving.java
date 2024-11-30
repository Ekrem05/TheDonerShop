package com.thedonershop.donershop.model.entity.product;

public class Serving {

    private String name;
    private double priceAdjustment;

    public Serving(String name, double priceAdjustment) {
        this.name = name;
        this.priceAdjustment = priceAdjustment;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceAdjustment() {
        return priceAdjustment;
    }

    public void setPriceAdjustment(double priceAdjustment) {
        this.priceAdjustment = priceAdjustment;
    }

}
