package com.designpattern.behavioral.mediator;

public abstract class Vehicle {

    protected String vechileId;
    protected Mediator mediator;

    public Vehicle(Mediator mediator, String vechileId) {
        this.mediator = mediator;
        this.vechileId = vechileId;
    }

    public void landWhenAllowed() throws InterruptedException {
        while(!mediator.isLandingPermitted(vechileId)) {
            System.out.println("Vechile "+mediator.whoIsLandingNow()+" is landing now, so try again later");
            wait(1000); //wait and try after 10 seconds
        }
        mediator.landingNow(vechileId);
        mediator.landingComplete(vechileId);
    }

}
