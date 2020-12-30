package com.designpattern.structural.adapter;

/**
 * 1) This pattern acts as a connector between two incompatible interfaces
 *      that otherwise cannot be connected directly
 * 2) This pattern allows objects with incompatible interfaces to collaborate
 *
 */
public class AdapterExample {

    public static void main(String[] args) {

        clientUsingCSVConverter(); //10,Downing st,London,UK
        clientUsingCSVwithHeader(); //streetNo,streetName,city,country
                                    //10,Downing st,London,UK
    }

    private static void clientUsingCSVConverter() {
        Converter converter = new CSVConverter();
        Address address = new Address("10", "Downing st", "London", "UK");
        String csv = converter.convert(address); //returns CSV
        System.out.println("csv:" + csv);
    }

    private static void clientUsingCSVwithHeader() {
        Converter converter = new CSVHeaderAdapter(new CSVConverter());
        Address address = new Address("10", "Downing st", "London", "UK");
        String csvWithHeader = converter.convert(address); //returns CSV with Header
        System.out.println("csv with header:" + csvWithHeader);
    }
}



