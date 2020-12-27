package com.core.deepcopy;

class User implements Cloneable {

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    //Copy constructor
    public User(User user) {
        this.name = user.name; //value is copied since primitive type
        this.address = new Address(user.address); //new object is created with its values copied or deep copy
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
        clone.address = new Address(this.address); //new object is created with its values copied or deep copy
        //or
        clone.address = (Address)this.address.clone(); //new object is created with its values copied or deep copy
        //both copyConstructor and clone() will create new object with its copied values
        return clone;
    }
}
