package com.oops.inheritance;

public class InheritanceExample {

    public static void main(String[] args) {

        BasePayment payment = new BasePayment();
        payment.makePayment(); //print Making BasePayment
        payment = new LocalPayment();
        payment.makePayment(); //print Making LocalPayment
        payment = new PayrollPayment();
        payment.makePayment(); //print Making PayrollPayment

    }

}
