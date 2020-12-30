package com.designpattern.structural.adapter;

class Address {
    public Address(String streetNo, String streetName, String city, String country) {
        this.streetName = streetName;
        this.streetNo = streetNo;
        this.city = city;
        this.country = country;
    }

    private String streetNo;
    private String streetName;
    private String city;
    private String country;

    public String getStreetNo() {
        return streetNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
