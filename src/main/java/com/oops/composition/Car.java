package com.oops.composition;

public class Car { //Parent class

    //Car contains Engine
    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void startEngine() {
        engine.startEngine();
    }

    public void shutDown(){
        engine.shutDown();
    }
}
