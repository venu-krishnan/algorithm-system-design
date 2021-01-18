package com.designpattern.behavioral.chainofresposibility;

public class AuditLogHandler implements Handler {

    private Handler next;

    public AuditLogHandler(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String command) {
        System.out.println("AuditLogHandler handling command:"+command);
        if(next != null)
            next.handle(command);
    }
}
