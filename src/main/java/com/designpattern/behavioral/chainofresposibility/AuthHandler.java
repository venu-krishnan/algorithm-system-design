package com.designpattern.behavioral.chainofresposibility;

public class AuthHandler implements Handler {

    private Handler next;

    public AuthHandler(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String command) {
        System.out.println("AuthHandler handling command:"+command);
        if(next != null)
            next.handle(command);
    }
}
