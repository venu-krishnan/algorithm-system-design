package com.designpattern.structural.flyweight;

import java.util.Map;
import java.util.HashMap;

public class PaymentFactory {

    private static Map<PaymentType, Payment> cache = new HashMap<>();

    public static Payment makePayment(PaymentType type) throws Exception {
        if (!cache.containsKey(type)) {
            cache.put(type, createPayment(type));
        }
        return cache.get(type);
    }

    private static Payment createPayment(PaymentType type) throws Exception {
        switch (type) {
            case LocalPayment:
                return new LocalPayment();
            case CrossBorderPayment:
                return new CrossBorderPayment();
        }
        throw new Exception("No such Payment type exists: " + type);
    }
}
