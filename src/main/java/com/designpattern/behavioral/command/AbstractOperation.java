package com.designpattern.behavioral.command;

public abstract class AbstractOperation implements OperationCommand {

    protected OrderReceiver orderReceiver;
    protected int itemId;

    protected AbstractOperation(OrderReceiver orderReceiver) {
        this.orderReceiver = orderReceiver;
    }

    protected AbstractOperation(OrderReceiver orderReceiver, int itemId) {
        this.orderReceiver = orderReceiver;
        this.itemId = itemId;
    }
}
