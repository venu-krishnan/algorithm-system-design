package com.designpattern.solid;

/**
 1) Entities must depend on abstractions, not on concretions
 2) High-level classes shouldn’t depend on low-level classes. Both should depend on abstractions.
 3) Abstractions shouldn’t depend on details. Details should depend on abstractions.
 4) This principle allows for decoupling
 */
public class DependencyInversionPrinciple {

}

interface Database {
    void insert(); //DB behaviour
}
class MySqlDB implements Database {
    public void insert(){}
}

//Bad implementation
//because high level(Report) and low-level(MySqlDB) are tightly dependent
class ReportBadImplementation {
    public void save(){
        MySqlDB db = new MySqlDB();
        db.insert();
    }
}

//Good implementation
//because both high and low level classes depend on abstraction and not implementation,
// which is loosely coupled. Lowlevel implementation can be injected to highlevel and viceversa
class ReportGoodImplementation {
    private Database db;
    public ReportGoodImplementation(Database db){
        this.db = db;
    }
    public void save(){
        db.insert();
    }
}



