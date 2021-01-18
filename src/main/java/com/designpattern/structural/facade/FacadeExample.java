package com.designpattern.structural.facade;

/**
 * 1) This pattern encapsulates a complex subsystem behind a simple interface.
 * 2) It hides much of the complexity and makes the subsystem easy to use.
 * 3) provides a simplified interface to a library, a framework,
 *      or any other complex set of classes.
 * 4) Facade provides option to have implementation loosely coupled to
 *      3rd party library via simple interface
 *
 */
public class FacadeExample {

    public static void main(String[] args) {

        //Facade process method encapsulates and hides series of steps
        // by exposing a simple interface
        OrderService orderService = new OrderServiceFacade();
        //only process() method is exposed which internally calls series of steps
        orderService.process(100);

    }
}
