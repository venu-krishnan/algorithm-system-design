package com.designpattern.structural.flyweight;

public class CrossBorderPayment implements Payment {

    @Override
    public void makePayment(int amount) {
        System.out.println("Making CrossBorderPayment");
    }
}
