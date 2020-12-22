package com.designpattern.creational.factorymethod;

public class CarFactory {
    public static Car getCar(String energyType) {
        if ("Electric".equals(energyType)) {
            return new TeslaCar();
        } else if ("Gasoline".equals(energyType)) {
            return new CombustionCar();
        }
        throw new IllegalArgumentException("Not a supported energy type");
    }
}
