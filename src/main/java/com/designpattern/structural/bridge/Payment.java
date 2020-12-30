package com.designpattern.structural.bridge;

abstract class Payment {
    public Payment(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    protected PaymentMethod paymentMethod;

    public abstract void withDrawPayment(float amount);
}

class CrossBorderPayment extends Payment {
    public CrossBorderPayment(PaymentMethod paymentMethod){
        super(paymentMethod);
    }
    @Override
    public void withDrawPayment(float amount) {
        paymentMethod.withDraw(amount);
        System.out.println("Amount withdrawn for CrossBorder Payment");
    }
}
class LocalPayment extends Payment {
    public LocalPayment(PaymentMethod paymentMethod){
        super(paymentMethod);
    }
    @Override
    public void withDrawPayment(float amount) {
        paymentMethod.withDraw(amount);
        System.out.println("Amount withdrawn for Local Payment");
    }
}
