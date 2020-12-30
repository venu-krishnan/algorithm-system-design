package com.designpattern.creational.singleton;

/**
 * 1) This pattern is used when only single instance of object is created and used by clients
 *  like resource intense objects like DB or file, etc
 * 2) Violates the Single Responsibility Principle, but it solves other problems
 * 3) Note: instance creation to be handled safe in concurrency (as simple basic code is not thread safe)
 */
public class SingletonExample {

    public static void main(String[] args) {

        DatabaseConnection dbConn = DatabaseConnection.getInstance();
        DatabaseConnection dbConn2 = DatabaseConnection.getInstance();

        System.out.println("is equal:"+(dbConn.equals(dbConn2)));// true, as the same instance if returned

    }
}

