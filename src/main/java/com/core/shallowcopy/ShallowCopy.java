package com.core.shallowcopy;

/**
 * Shallow Copy - copies its values for immutable objects like String and primitive objects
 *          but it copies only the object reference(memory address) for mutable objects
 */
public class ShallowCopy {

    public static void main(String[] args) {

        //different methods of Shallow copy
        //1)
        //usingCopyConstructor();

        //2)
        usingCloneMethod(); //using Cloneable interface

    }

    private static void usingCopyConstructor() {
        Address address = new Address("Downing St 10", "London");
        Address clonedAddress = new Address(address); // constructor clone

        System.out.println("address: "+address); // com.core.Address@15db9742
        System.out.println("clonedAddress: "+clonedAddress); //com.core.Address@6d06d69c
        System.out.println("assert : "+ (address != clonedAddress));// true, as cloned object is a new object

        User user = new User("name", address);
        User clonedUser = new User(user); // constructor clone

        System.out.println("user: "+user); // com.core.User@7852e922
        System.out.println("clonedUser: "+clonedUser); //com.core.User@4e25154f
        System.out.println("assert : "+ (user != clonedUser));// true, as cloned object is a new object

        System.out.println("user.getAddress(): "+user.getAddress()); // com.core.Address@15db9742
        System.out.println("clonedUser.getAddress(): "+clonedUser.getAddress()); //com.core.Address@15db9742
        System.out.println("assert : "+ (user.getAddress()
                == clonedUser.getAddress()));// true, as only reference is copied, hence both point to same object

    }

    private static void usingCloneMethod() {

        Address address = new Address("Downing St 10", "London");
        System.out.println("address: "+address); // com.core.Address@6d06d69c

        //clone() method implementation in conjunction with Cloneable interface
        //Note: without implement Cloneable interface, it throws CloneNotSupportedException
        Address clonedAddress = (Address)address.clone(); // clone() method

        System.out.println("clonedAddress: "+clonedAddress); //com.core.Address@15db9742
        System.out.println("assert : "+ (address != clonedAddress));// true, as cloned object is a new object

        User user = new User("name", address);
        System.out.println("user: "+user); // com.core.User@4e25154f
        User clonedUser = (User)user.clone(); // clone()
        System.out.println("clonedUser: "+clonedUser); //com.core.User@70dea4e
        System.out.println("assert : "+ (user != clonedUser));// true, as cloned object is a new object

        System.out.println("user.getAddress(): "+user.getAddress()); // com.core.Address@6d06d69c
        System.out.println("clonedUser.getAddress(): "+clonedUser.getAddress()); //com.core.Address@6d06d69c
        System.out.println("assert : "+ (user.getAddress()
                == clonedUser.getAddress()));// true, as only reference is copied, hence both point to same object
    }

}

