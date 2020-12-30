package com.designpattern.structural.bridge;

/**
 * 1) This pattern is to decouple an abstraction from its implementation so that the two can vary independently
 * 2) The goal is to split a large class or a set of closely related classes into two separate
 *      hierarchies — abstraction and implementation — which can be developed independently of each other.
 * 3) Open/Closed principle and Single Responsibility Principle are supported
 * 4)
 */
public class BridgeExample {

    public static void main(String[] args) {
        //loosely coupled paymentMethod with Payment abstraction
        Payment crossBorder = new CrossBorderPayment(new DebitCard());
        crossBorder.withDrawPayment(100);
        crossBorder = new CrossBorderPayment(new CreditCard());
        crossBorder.withDrawPayment(100);

        Payment localPayment = new LocalPayment(new DebitCard());
        localPayment.withDrawPayment(200);
        localPayment = new LocalPayment(new CreditCard());
        localPayment.withDrawPayment(200);
    }
}




