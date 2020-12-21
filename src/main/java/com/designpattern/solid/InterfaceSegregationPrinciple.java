package com.designpattern.solid;

/**
 1) Clients shouldn’t be forced to depend on methods they do not use.
 2) client should never be forced to implement an interface that it doesn’t use
 3) design should have narrow interface so client can implement only what is needed
 4) Segregate the interfaces with only necessary behavior(methods)
 */
public class InterfaceSegregationPrinciple {

}

//violates this principle as it forces to implement behavior that doesn't needed
//combustion vehicles doesn't implement electric charge
//electric vehicles doesnt implement fuel fillUp
interface FindStation {
    void fillUp(); //combustion vehicles
    void charge(); //electric vehicles
}

class CombustionVehicles implements FindStation {
    public void fillUp() {
        System.out.println("implement fill up");
    }
    //violates this principle as it forces to implement behavior that doesn't needed
    public void charge() {
        //do nothing as combustion doesn't need electric
    }
}

class ElectricVehicles implements FindStation {
    //violates this principle as it forces to implement behavior that doesn't needed
    public void fillUp() {
        //do nothing as electric doesn't need fillup
    }
    public void charge() {
        System.out.println("implement charge");
    }
}


