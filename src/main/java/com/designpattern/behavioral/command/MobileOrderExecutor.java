package com.designpattern.behavioral.command;

public class MobileOrderExecutor {

    public void executeOperation(OperationCommand operation) {
        operation.execute();
    }
}
