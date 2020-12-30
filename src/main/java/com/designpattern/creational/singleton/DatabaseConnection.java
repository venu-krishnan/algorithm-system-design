package com.designpattern.creational.singleton;

class DatabaseConnection {

    private static DatabaseConnection dbconnection = null;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (dbconnection == null)
            dbconnection = new DatabaseConnection();
        return dbconnection;
    }
}
