package com.core.serialization;

import java.io.Serializable;

class Address implements Serializable {

    public Address(String streetName, int streetNumber,
                   String city, String homeKey) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.homeKey = homeKey;
    }

    private String streetName;
    private int streetNumber;
    private String city;
    private transient String homeKey; //doesn't want to serialize

    //Note: serialize and deserilaize with same serialVersionUID, otherwise it throws exception
    // class incompatible: stream classdesc serialVersionUID = 10, local class serialVersionUID = 20
    private static final long serialVersionUID = 10L;

    public String getStreetName() {
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    public String getHomeKey() {
        return homeKey;
    }
}
