package com.designpattern.solid;

/**
 1) Classes should be open for extension but closed for modification.
 2) principle is to keep existing code from breaking when you implement new features.
 3) A class is open to extend, produce a subclass and override base behaviour
 4) A class is closed for any modification if it is 100% ready and exposed to outside world
 */
public class OpenClosedPrinciple {

    public static void main(String[] args) {

        PaymentMethod debitCard = new DebitCard();
        PaymentMethod creditCard = new CreditCard();
        Payment debitPayment = new Payment(debitCard);
        debitPayment.process();// debit

        Payment creditPayment = new Payment(creditCard);
        creditPayment.process();// credit
    }
}

interface PaymentMethod {
    void withDraw(float amount);
}

class DebitCard implements PaymentMethod {
    public void withDraw(float amount) {
        System.out.println("debit card withdraw implementation");
    }
}

class CreditCard implements PaymentMethod {
    public void withDraw(float amount) {
        System.out.println("credit card withdraw implementation");
    }
}

// Payment class is closed for any direct implementation of PaymentMethod,
// but open for extension via PaymentMethod interface for any new implementation
class Payment {

    public Payment(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    private PaymentMethod paymentMethod;

    public void process() {
        paymentMethod.withDraw(500);
    }
}


