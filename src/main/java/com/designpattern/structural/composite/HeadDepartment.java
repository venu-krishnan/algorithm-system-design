package com.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

//Composite class that has collection of Leaf classes
//and implements base component behaviour
class HeadDepartment implements Department {

    List<Department> list = new ArrayList<>();

    public void addDepartment(Department dept){
        list.add(dept);
    }

    public void print() {
        System.out.println("HeadDepartment contains:");
        list.forEach(Department::print);
    }
}
