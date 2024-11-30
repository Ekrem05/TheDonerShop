package com.thedonershop.donershop.model.entity.product;

public class Ingredient {
    private String name;
    private boolean isRequired;

    public Ingredient(String name, boolean isRequired) {
        this.name = name;
        this.isRequired = isRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }
}
