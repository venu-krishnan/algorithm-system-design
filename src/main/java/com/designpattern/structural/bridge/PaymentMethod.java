package com.designpattern.structural.bridge;

interface PaymentMethod {
    void withDraw(float amount);
}

class DebitCard implements PaymentMethod {
    @Override
    public void withDraw(float amount) {
        System.out.println("withDraw amount from DebitCard");
    }
}
class CreditCard implements PaymentMethod {
    @Override
    public void withDraw(float amount) {
        System.out.println("withDraw amount from CreditCard");
    }
}
