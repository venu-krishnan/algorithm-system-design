package com.designpattern.behavioral.command;

import java.util.List;

public class OrderReceiver {

    private String customerId;
    private List<Integer> itemList;

    public OrderReceiver(String customerId) {
        this.customerId = customerId;
    }

    public void addItem(int itemId) {
        itemList.add(itemId);
    }
    public void removeItem(int itemId) {
        itemList.remove(itemId);
    }
    public void placeOrder() {
        //logic to proceed with Order Placement
        //clear items once order is placed
        itemList.clear();
    }

}
