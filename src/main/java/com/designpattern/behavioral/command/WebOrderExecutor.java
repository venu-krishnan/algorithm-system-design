package com.designpattern.behavioral.command;

public class WebOrderExecutor {

    public void executeOperation(OperationCommand operation) {
        operation.execute();
    }
}
