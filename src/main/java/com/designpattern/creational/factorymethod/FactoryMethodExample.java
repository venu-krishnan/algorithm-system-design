package com.designpattern.creational.factorymethod;


/**
 * 1) GOF says: defines an interface for creating an object, but let subclasses decide which class to instantiate
 * 2) This pattern delegates the responsibility of initializing a class by the client
 *  to a particular factory class by creating a type of virtual constructor.
 * 3) Factory class is responsible for producing objects that hides implementation details from client code
 * 4) Single Responsibility Principle - producing objects are contained to single factory class
 * 5) Open/Closed Principle - new subclasses can be implemented in factory without breaking existing client code
 */
public class FactoryMethodExample {

    public static void main(String[] args) {
        Car electricCar = CarFactory.getCar("Electric");
        Car combustionCar = CarFactory.getCar("Gasoline");
    }
}

