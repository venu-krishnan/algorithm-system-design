package com.designpattern.solid;

/**
 1) Every subclass or derived class should be substitutable for their base or parent class
 2) ie) pass object of a subclass as a substitute of the parent class without breaking the client code.
 3) subclass implementation should remain compatible with the behavior of the superclass
 4) Note:
    in static typing, compiler would ensure there is no type mismatch in subclass
    but implementation should be compatible with base class behaviour (no violation),
    in dynamic typing, a type mismatch is possible that can violates this principle,
    so the implementation as well as type matching should be compatible with base class
 */
public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        Car car = new CombustionCar();

        FuelStation fuelStation = new FuelStation();
        fuelStation.find(car);

        //violates this principle because extended class(FuelStationWithCharger)
        // is not compatible with base class behaviour as it calls charge and not fillUp
        fuelStation = new FuelStationWithCharger();
        fuelStation.find(car); //combustionCar cannot be charged, hence it violates

        //although below implementation works
        car = new TeslaCar();
        fuelStation = new FuelStationWithCharger();
        fuelStation.find(car); //TeslaCar
    }

}

class Car {
    public void fillUp(){ }
}
class CombustionCar extends Car {
    public void fillUp(){ }
}
class TeslaCar extends Car {
    public void charge(){ }
}

class FuelStation {
    public void find(Car car){
        car.fillUp();
    }
}
class FuelStationWithCharger extends FuelStation {
    public void find(TeslaCar car){
        car.charge();
    }
}



