package com.designpattern.behavioral.chainofresposibility;

public class BaseHandler implements Handler {

    private Handler next;

    public BaseHandler(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String command) {
        System.out.println("BaseHandler handling command:"+command);
        if(next != null)
            next.handle(command);
    }
}
