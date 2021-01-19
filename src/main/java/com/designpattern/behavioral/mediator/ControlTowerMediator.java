package com.designpattern.behavioral.mediator;

public class ControlTowerMediator implements Mediator {

    boolean isLandingAllowedNow = true;
    String whoIsLandingNow;

    @Override
    public boolean isLandingPermitted(String aircraftId) {
        System.out.println("is landing permitted for Aircraft "+aircraftId+" :"+isLandingAllowedNow);
        return isLandingAllowedNow;
    }

    @Override
    public void landingNow(String aircraftId) {
        if(isLandingAllowedNow) {
            whoIsLandingNow = aircraftId;
            isLandingAllowedNow = false;
            System.out.println("Aircraft: "+aircraftId+" is landing now..");
        }
    }

    @Override
    public void landingComplete(String aircraftId) {
        isLandingAllowedNow = true;
        whoIsLandingNow = null;
        System.out.println("Landing complete for Aircraft: "+aircraftId);
    }

    @Override
    public String whoIsLandingNow() {
        System.out.println("Aircraft: "+whoIsLandingNow+ " is landing now");
        return whoIsLandingNow;
    }
}
