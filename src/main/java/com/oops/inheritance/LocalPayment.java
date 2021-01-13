package com.oops.inheritance;

public class LocalPayment extends BasePayment {

    @Override
    public void makePayment() {
        System.out.println("Making LocalPayment");
    }
}
