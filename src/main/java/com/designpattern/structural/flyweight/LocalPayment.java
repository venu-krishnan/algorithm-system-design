package com.designpattern.structural.flyweight;

public class LocalPayment implements Payment {

    @Override
    public void makePayment(int amount) {
        System.out.println("Making LocalPayment");
    }
}
