package com.onetechone.design.designpattern.factory;

public abstract class Car {

    public abstract String getSpeed();

    public abstract String getWeight();

    @Override
    public String toString() {
        return "speed = " + getSpeed() + " weight = " + getWeight();

    }

}
