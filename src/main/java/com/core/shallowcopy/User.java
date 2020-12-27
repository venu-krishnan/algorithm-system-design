package com.core.shallowcopy;

class User implements Cloneable {

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    //Copy constructor
    public User(User user) {
        this.name = user.name; // value is copied since primitive type
        this.address = user.address; //reference(memory address) is copied or shallow copy
    }

    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Object clone() {
        User clone = null;
        try {
            clone = (User) super.clone(); //super.clone() would default do shallow copy
            System.out.println("super.clone():" + clone);
        } catch (CloneNotSupportedException e) {
            //without implement Cloneable interface, it throws CloneNotSupportedException
            clone = new User(this.name, this.address);
        }
        return clone;
    }
}
