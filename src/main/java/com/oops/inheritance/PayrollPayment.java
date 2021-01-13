package com.oops.inheritance;

public class PayrollPayment extends BasePayment {

    @Override
    public void makePayment() {
        System.out.println("Making PayrollPayment");
    }
}
