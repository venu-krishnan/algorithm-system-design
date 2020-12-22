package com.designpattern.creational.abstractfactory;

import com.designpattern.creational.factorymethod.Car;

/**
 * 1) GOF says: This pattern provides an interface for creating families of related or dependent
 *  objects without specifying their concrete classes
 * 2) This pattern is a super factory that creates other factories, also called as factory of factories
 * 3) Single Responsibility Principle - producing objects are contained to single factory class
 * 4) Open/Closed Principle - new subclasses can be implemented in factory without breaking existing client code
 *
 */
public class AbstractFactoryExample {

    public static void main(String[] args) {
        //here, 2 factory classes are produced  based on input
        AbstractFactory carFactory = FactoryProvider.getFactory("Car");
        AbstractFactory truckFactory = FactoryProvider.getFactory("Truck");

        //below is a Factory Method pattern
        Car car = (Car) carFactory.getVehicle("Electric");
        Truck truck = (Truck)truckFactory.getVehicle("Gasoline");
    }

}
