package com.designpattern.solid;

/**
 1) A class should have just one reason to change.
 2) Every class is responsible for a single aspect/part of the functionality
 3) goal of this principle is to reduce complexity and no monolith code
 */
public class SingleResponsibilityPrinciple {

    public static void main(String[] args) {
        //Employee, Department, Worksheet are all 3 different aspects in a company
        //and the respective classes have single responsibility
        // to handle its own state and behavior
        Department department = new Department("IT", "Sean");
        Employee emp = new Employee("Mike", department);
        Worksheet worksheet = new Worksheet(emp);
        worksheet.print();
    }
}

class Department {

    public Department(String name, String manager) {
        this.name = name;
        this.manager = manager;
    }
    private String name;
    private String manager;

    public String getName() {
        return name;
    }
    public String getManager() {
        return manager;
    }
}

class Employee {
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    private String name;
    private Department department;

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}

class Worksheet {
    public Worksheet(Employee emp) {
        employee = emp;
    }
    private Employee employee;

    public void print() {
        System.out.print("Employee name:"+ employee.getName() +
                " Department name:"+employee.getDepartment().getName()+
                " Manager: "+employee.getDepartment().getManager());
    }

}



