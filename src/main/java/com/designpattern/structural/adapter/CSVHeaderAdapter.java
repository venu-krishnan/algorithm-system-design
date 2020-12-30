package com.designpattern.structural.adapter;

class CSVHeaderAdapter implements Converter {
    private CSVConverter converter;

    public CSVHeaderAdapter(CSVConverter converter) {
        this.converter = converter;
    }

    public String convert(Address address) {
        return addHeader(address) + "\n" +
                converter.convert(address); //return CSV with header
    }

    private String addHeader(Address address) {
        //Note: in the realworld, reflection can be used to get field names
        return "streetNo,streetName,city,country";
    }
}
