package com.designpattern.structural.decorator;

/**
 * 1) This pattern is used to attach additional behaviours/responsibilities to objects
 *  by placing them inside special wrapper objects that contains additional behaviours.
 * 2) Decorator provides an enhanced interface to the original object
 * 3) Composition is preferred over inheritance to reduce overhead
 *      of having number of subclasses with decorator behaviours
 * 4) A decorator, delegates it to wrapped object(wrapee) and does the additional behaviours too
 *
 */
public class DecoratorExample {

    public static void main(String[] args) {

        System.out.println("test");

        //Object that to be decorated
        Notifier notifier = new Notifier();

        //Decorators that wrapped the Notifier(wrappee)
        BaseDecorator decorator = new SkypeNotifier(notifier);
        decorator.send("skype");
        decorator = new FacebookNotifier(notifier);
        decorator.send("facebook");
    }
}
