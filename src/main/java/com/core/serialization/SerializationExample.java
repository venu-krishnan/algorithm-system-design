package com.core.serialization;

import java.io.*;

public class SerializationExample {

    private static final String additionalData = "write additional data";

    public static void main(String[] args){

        String fileName = "/Users/Downloads/Object.txt";

        Address address = new Address("Downing st",
                10, "London", "homeKey");
        try {
            serializeObject(address, fileName);
            Address deserializedObj = deSerializeObject(fileName);

            System.out.println("is City equal:" +
                    address.getCity().equals(deserializedObj.getCity()));
            System.out.println("is StreetName equal:" +
                    address.getStreetName().equals(deserializedObj.getStreetName()));
            System.out.println("is StreetNumber equal:" +
                    (address.getStreetNumber() == deserializedObj.getStreetNumber()));
            System.out.println("is HomeKey equal:" +
                    address.getHomeKey().equals(deserializedObj.getHomeKey()));
            System.out.println("address.HomeKey:" +
                    address.getHomeKey());
            System.out.println("deserializedObj.HomeKey:" +
                    deserializedObj.getHomeKey());

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void serializeObject(Address address, String fileName)
            throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(address);
        objectOutputStream.writeObject(additionalData);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    private static Address deSerializeObject(String fileName)
            throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Address address = (Address) objectInputStream.readObject();
        //must be read in the same order it was serialized/written
        String deserializedAdditionalData = (String)objectInputStream.readObject();//additional data
        System.out.println("deserializedAdditionalData:"+ deserializedAdditionalData);
        objectInputStream.close();
        return address;
    }

}

