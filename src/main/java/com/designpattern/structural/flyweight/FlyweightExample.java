package com.designpattern.structural.flyweight;

/**
 * 1) This pattern is also called as factory with cache, ie) stores objects after creation and
 * reuses them from cache instead of recreating it when re-asked.
 * 2) This is used to reduce memory footprint, that improves performance in applications
 * where object instantiation is expensive
 * 3) It's very important that the flyweight objects are immutable,
 *  any operation on the state must be performed by the factory.
 *
 */
public class FlyweightExample {

    public static void main(String[] args) throws Exception {

        Payment payment = PaymentFactory.makePayment(PaymentType.LocalPayment);
        payment.makePayment(100); //Making LocalPayment
        payment = PaymentFactory.makePayment(PaymentType.CrossBorderPayment);
        payment.makePayment(200); //Making CrossBorderPayment
    }
}
