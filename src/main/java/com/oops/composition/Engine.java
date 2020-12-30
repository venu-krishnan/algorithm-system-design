package com.oops.composition;

//Note: Reason for package access is, so other packages cannot access this
//intention is only Parent class(Car) should access this class
class Engine { //Child class

    public Engine(){
    }

    public void startEngine(){
        System.out.println("Engine start");
    }

    public void shutDown(){
        System.out.println("Engine shutdown");
    }

}
