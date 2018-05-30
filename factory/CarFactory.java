package com.onetechone.design.designpattern.factory;

public class CarFactory {

    public static Car getComputer(String type, String ram, String hdd)
    {
        if(type.equals("pc"))
            return new Sedan(ram,hdd);
        if(type.equals("laptop"))
            return new Suv(ram,hdd);

        return null;
    }
}
