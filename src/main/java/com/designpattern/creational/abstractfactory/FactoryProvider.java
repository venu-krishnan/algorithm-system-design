package com.designpattern.creational.abstractfactory;

public class FactoryProvider  {

    public static AbstractFactory getFactory(String type) {
        if("Car".equals(type))
            return new CarFactory();
        else  if("Truck".equals(type))
            return new TruckFactory();
        else
            throw new IllegalArgumentException("Not supported");
    }


}
