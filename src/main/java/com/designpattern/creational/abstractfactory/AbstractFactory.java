package com.designpattern.creational.abstractfactory;

public interface AbstractFactory<T> {
    T getVehicle(String type);
}
