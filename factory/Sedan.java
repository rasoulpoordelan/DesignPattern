package com.onetechone.design.designpattern.factory;

public class Sedan extends Car {

    private String speed;
    private String weight;

    public Sedan() {
    }

    public Sedan(String speed, String weight) {
        this.speed = speed;
        this.weight = weight;
    }

    @Override
    public String getSpeed() {
        return this.speed;
    }

    @Override
    public String getWeight() {
        return this.weight;
    }
}
