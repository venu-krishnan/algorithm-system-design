package com.designpattern.behavioral.command;

public class AddItemOperation extends AbstractOperation {

    public AddItemOperation(OrderReceiver orderReceiver, int itemId) {
        super(orderReceiver, itemId);
    }

    @Override
    public void execute() {
        orderReceiver.addItem(itemId);
    }
}
