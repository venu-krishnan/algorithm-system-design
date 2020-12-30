package com.designpattern.structural.composite;

/**
 * 1) This pattern composes objects into tree structures and work as if they were individual objects
 * 2) Both individual objects and a composition of objects are treated same way
 * 3) Pattern breaks down to:
 *      base component - interface or abstract class that defines behaviours
 *      leaf - individual object that implement default behaviour of base component
 *      composite - implements base component and has a collection of leaf elements
 *          and defines the child-related operations
 * 4) Could be used where there is a need for recursion in conjunction with polymorphism
 *
 */
public class CompositeExample {

    public static void main(String[] args) {

        //Component
        Department salesDepartment = null;

        //Leaf
        salesDepartment = new SalesDepartment();
        salesDepartment.print();
        Department financeDepartment = new FinanceDepartment();
        financeDepartment.print();

        //Composite
        HeadDepartment headDepartment = new HeadDepartment();
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financeDepartment);
        headDepartment.print();
    }
}
