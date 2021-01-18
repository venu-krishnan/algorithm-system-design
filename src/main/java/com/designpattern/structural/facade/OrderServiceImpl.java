package com.designpattern.structural.facade;

class OrderServiceImpl {

    int orderNumber;

    //package scope as only OrderServiceFacade can use this
    OrderServiceImpl(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void validate() {
        System.out.println("validating order");
    }

    public void isInStock() {
        System.out.println("checking if ordered items are in stock");
    }

    public void acceptPayment() {
        System.out.println("accept payment for thr order");
    }

    public void process() {
        System.out.println("process the order");
    }
}
