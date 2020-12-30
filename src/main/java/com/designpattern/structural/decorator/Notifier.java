package com.designpattern.structural.decorator;

//Object to be wrapped around
public class Notifier {
    public void send(String msg) {
        System.out.println("sending message:"+ msg);
    }
}
