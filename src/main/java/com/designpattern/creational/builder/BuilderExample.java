package com.designpattern.creational.builder;

/**
 * 1) GOF says : This patterns lets to construct complex objects step by step
 * 2) When the object creation is complex, this pattern separates out the instantiation process
 *      by using another object (a builder) to construct the object.
 * 3) Although GOF uses abstraction to build complex object,
 *  below example is the modern approach as suggested by Joshua Bloch, in his book Effective Java
 */
public class BuilderExample {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount
                .BankAccountBuilder("Mike", "12345") // mandatory attributes
                .withEmail("email@bank.com")  //optional attributes
                .withAddress("address") //optional attributes
                .build();

        System.out.println("Bank account name:"+bankAccount.getName());
        System.out.println("Bank account number:"+bankAccount.getAccountNumber());
        System.out.println("Bank account email:"+bankAccount.getEmail());
        System.out.println("Bank account address:"+bankAccount.getAddress());
    }

}
