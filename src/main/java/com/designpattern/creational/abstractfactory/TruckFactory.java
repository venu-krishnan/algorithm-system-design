package com.designpattern.creational.abstractfactory;

public class TruckFactory implements AbstractFactory<Truck> {

    public Truck getVehicle(String energyType) {
        if ("Gasoline".equals(energyType)) {
            return new CombustionTruck();
        }
        throw new IllegalArgumentException("Not supported");
    }
}
