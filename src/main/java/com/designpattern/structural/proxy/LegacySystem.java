package com.designpattern.structural.proxy;

import java.util.HashMap;

public class LegacySystem implements Operation {

    //assuming permanentStore in Legacy system
    private HashMap<String, String> permanentStore = new HashMap<>();

    public void add(String key, String value) {
        permanentStore.put(key, value);
    }
    public String get(String key) {
        return permanentStore.get(key);
    }
}
