package com.core.deepcopy;

class Address implements Cloneable {

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    //Copy constructor
    public Address(Address address) {
        this.street = address.street; // value is copied since primitive type
        this.city = address.city; //value is copied since primitive type
    }

    private String street;
    private String city;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public Object clone() {
        Address clone = null;
        try {
            clone = (Address) super.clone(); //super.clone() would default do shallow copy
            System.out.println("super.clone():" + clone);
        } catch (CloneNotSupportedException e) {
            //without implement Cloneable interface, it throws CloneNotSupportedException
            clone = new Address(this.street, this.city);
        }
        return clone;
    }
}
