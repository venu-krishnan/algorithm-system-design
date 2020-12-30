package com.designpattern.structural.adapter;

class CSVConverter implements Converter {
    public String convert(Address address) {
        //convert address object to CSV
        return address.getStreetNo()+","
                +address.getStreetName()+","
                +address.getCity()+","
                +address.getCountry();
    }
}
