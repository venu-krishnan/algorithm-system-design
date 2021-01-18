package com.designpattern.structural.facade;

public class OrderServiceFacade implements OrderService {

    //Facade process method encapsulates and hides series of steps
    // by exposing a simple interface
    @Override
    public void process(int orderNumber) {

        OrderServiceImpl orderService = new OrderServiceImpl(orderNumber);
        orderService.validate();
        orderService.isInStock();
        orderService.acceptPayment();
        orderService.process();
    }
}
