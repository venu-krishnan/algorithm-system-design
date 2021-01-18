package com.designpattern.behavioral.command;

public class PlaceOrderOperation extends AbstractOperation {

    public PlaceOrderOperation(OrderReceiver orderReceiver) {
        super(orderReceiver);
    }

    @Override
    public void execute() {
        orderReceiver.placeOrder();
    }
}
