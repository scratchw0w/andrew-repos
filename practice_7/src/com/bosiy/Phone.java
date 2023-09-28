package com.bosiy;

public class Phone {

    private String model;
    private int amount;

    public Phone(String model, int amount) {
        this.model = model;
        this.amount = amount;
    }

    public String allInfo() {
        return this.model + " " + amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getModel() {
        return this.model;
    }

}
