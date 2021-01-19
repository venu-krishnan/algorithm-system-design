package com.designpattern.behavioral.mediator;


/**
 * 1) This pattern reduces chaotic dependencies between tightly coupled objects. It restricts
 *  direct communications between the objects and forces them to
 *  collaborate only via a mediator object
 * 2) All the communication between main objects goes through the mediator.
 * 3) Mediator object synchronous communication between main objects that promotes loose coupling.
 *
 */
public class MediatorExample {

    public static void main(String[] args) throws InterruptedException {

        //ControlTower is the Mediator object where
        // all aircrafts communicate with, before landing for synchronous safe landing
        Mediator mediator = new ControlTowerMediator();

        Vehicle aircraft = new AircraftVehicle(mediator, "Boeing777");
        aircraft.landWhenAllowed();

        aircraft = new AircraftVehicle(mediator, "AirBus A380");
        aircraft.landWhenAllowed();

    }
}
