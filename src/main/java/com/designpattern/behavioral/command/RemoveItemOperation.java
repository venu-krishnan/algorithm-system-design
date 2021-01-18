package com.designpattern.behavioral.command;

public class RemoveItemOperation extends AbstractOperation {

    public RemoveItemOperation(OrderReceiver orderReceiver, int itemId) {
        super(orderReceiver, itemId);
    }

    @Override
    public void execute() {
        orderReceiver.removeItem(itemId);
    }
}
