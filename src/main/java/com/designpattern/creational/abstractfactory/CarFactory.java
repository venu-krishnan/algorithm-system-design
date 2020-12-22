package com.designpattern.creational.abstractfactory;

public class CarFactory implements AbstractFactory<Car> {
    public Car getVehicle(String energyType) {
        if ("Electric".equals(energyType)) {
            return new TeslaCar();
        } else if ("Gasoline".equals(energyType)) {
            return new CombustionCar();
        }
        throw new IllegalArgumentException("Not a supported energy type");
    }
}
