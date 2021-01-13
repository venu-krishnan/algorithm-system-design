package com.designpattern.structural.proxy;

import java.util.HashMap;

public class LegacySystemProxy implements Operation {

    private Operation legacySystem = null;

    public LegacySystemProxy(Operation legacySystem) {
        this.legacySystem = legacySystem;
    }

    // This proxy caches the data from Legacy, so "get" operation
    // is faster to return from cache instead of legacy everytime
    private HashMap<String, String> cache = new HashMap<>();

    public void add(String key, String value) {
        legacySystem.add(key, value);
    }

    public String get(String key) {
        String value = cache.get(key);
        if(value == null) { //if not in cache, then get it from legacy and cache it
            value = legacySystem.get(key);
            System.out.println("Doesn't exist in cache, fetch it from Legacy, key:"+key+" value:"+value);
            cache.put(key, value);
        }
        return value; //return from cache
    }
}
