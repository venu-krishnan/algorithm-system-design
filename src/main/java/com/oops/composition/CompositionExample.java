package com.oops.composition;

/**
 * 1) Composition is a subset of association, meaning they are specific cases of association
 * 2) Composition implies a relationship where the child cannot exist independent of the parent.
 *      Example: House (parent) and Room (child). Rooms don't exist separate to a House
 * 3) In a new class, have a private field that references an instance of the existing/child class
 *      to make it a component of new this class
 */
public class CompositionExample {

    public static void main(String[] args) {

        //Car owns Engine, but Engine(Child) object cannot be exist/created without Car(Parent)
        //Car manages the lifecycle of Engine object
        Car car = new Car();
        car.startEngine();
        car.shutDown();

    }
}

