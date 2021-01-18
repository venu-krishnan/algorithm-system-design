package com.designpattern.structural.proxy;

/**
 * 1) This pattern provides a substitute or placeholder for another object.
 * 2) This allows to creates intermediary that acts as an interface to another resource
 * 3) Proxy controls access to the original object, allowing to perform
 * something either before or after the request gets through to the original object.
 * 4) When to use this?
 *  When there is a heavy object that requires significant resources while initialize,
 *  then a proxy can be used as intermediate until the real need to invoke heavy object
 * 5) Proxy usually manages the lifecycle of its service object on its own.
 * 6) proxy can be used as interceptor to add additional behaviour to original object
 */
public class ProxyExample {

    public static void main(String[] args) {

        //Assuming LegacySystem is expensive object, creating a proxy to cache results
        Operation proxy = new LegacySystemProxy(new LegacySystem());
        proxy.add("1", "one");
        proxy.add("2", "two");
        proxy.get("1"); //first time; Doesn't exist in cache, fetch it from Legacy, key:1 value:one
        proxy.get("1"); //subsequent time, gets it from proxy cache

    }
}
