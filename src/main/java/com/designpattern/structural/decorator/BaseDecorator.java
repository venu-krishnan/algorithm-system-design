package com.designpattern.structural.decorator;

//Base decorator that outlines default behaviours
public abstract class BaseDecorator {

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
    protected Notifier notifier;
    public void send(String msg) {
        notifier.send(msg);
    }
}
