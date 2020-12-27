package com.designpattern.creational.prototype;

/**
 * 1) This pattern lets to copy/clone existing objects and produce new objects.
 * 2) There are different methods to copy/clone(shallow or deep copy) an object,
 *  like using copy constructors, clone method with Cloneable interface, regular copy method
 *
 */
public class PrototypeExample {

    public static void main(String[] args)  {

        FourthDimension dim = new FourthDimension("height", "width", "depth");
        dim.setTime("time");

        usingCopyMethod(dim);
        usingCopyConstructor(dim);
        usingCloneMethod(dim);
    }

    private static void usingCopyMethod(FourthDimension dim) {
        FourthDimension dim2 = (FourthDimension)dim.copy();
        dim2.setTime("time2");

        System.out.println("is Equal:"+ dim.equals(dim2)); //false, as they are 2 different objects
    }

    private static void usingCopyConstructor(FourthDimension dim) {
        FourthDimension dim2 = new FourthDimension(dim);
        dim2.setTime("time2");

        System.out.println("is Equal:"+ dim.equals(dim2)); //false, as they are 2 different objects
    }

    private static void usingCloneMethod(FourthDimension dim) {
        FourthDimension dim2 = (FourthDimension)dim.clone();
        dim2.setTime("time2");

        System.out.println("is Equal:"+ dim.equals(dim2)); //false, as they are 2 different objects
    }
}



