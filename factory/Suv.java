package com.onetechone.design.designpattern.factory;

public class Suv extends Car {

    private String speed;
    private String weight;

    public Suv() {
    }

    public Suv(String speed, String weight) {
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
