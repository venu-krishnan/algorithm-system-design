package com.designpattern.behavioral.mediator;

public interface Mediator {

    boolean isLandingPermitted(String aircraftId);
    void landingNow(String aircraftId);
    void landingComplete(String aircraftId);
    String whoIsLandingNow();
}
