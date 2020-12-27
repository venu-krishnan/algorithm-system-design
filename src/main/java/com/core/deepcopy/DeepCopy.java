package com.core.deepcopy;

/**
 * Deep Copy - copies its values for immutable objects like String and primitive objects
 *          but it also creates new objects(new references/memory address) with values copied recursively for mutable objects
 */
public class DeepCopy {

    public static void main(String[] args) {

        //different methods of Deep copy
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

        System.out.println("user.getAddress(): "+user.getAddress()); // com.core.deepcopy.Address@15db9742
        System.out.println("clonedUser.getAddress(): "+clonedUser.getAddress()); //com.core.deepcopy.Address@70dea4e
        System.out.println("assert : "+ (user.getAddress()
                == clonedUser.getAddress()));// false, as new object is created with values copied, hence both are different objects

    }

    private static void usingCloneMethod() {

        Address address = new Address("Downing St 10", "London");
        System.out.println("address: "+address); // com.core.deepcopy.Address@6d06d69c

        //clone() method implementation in conjunction with Cloneable interface
        //Note: without implement Cloneable interface, it throws CloneNotSupportedException
        Address clonedAddress = (Address)address.clone(); // clone() method

        System.out.println("clonedAddress: "+clonedAddress); //com.core.deepcopy.Address@15db9742
        System.out.println("assert : "+ (address != clonedAddress));// true, as cloned object is a new object

        User user = new User("name", address);
        System.out.println("user: "+user); // com.core.deepcopy.User@7852e922
        User clonedUser = (User)user.clone(); // clone()

        System.out.println("clonedUser: "+clonedUser); //com.core.deepcopy.User@4e25154f
        System.out.println("assert : "+ (user != clonedUser));// true, as cloned object is a new object

        System.out.println("user.getAddress(): "+user.getAddress()); // com.core.deepcopy.Address@6d06d69c
        System.out.println("clonedUser.getAddress(): "+clonedUser.getAddress()); //com.core.deepcopy.Address@70dea4e
        System.out.println("assert : "+ (user.getAddress()
                == clonedUser.getAddress()));// false, as new object is created with values copied, hence both are different objects
    }

}

