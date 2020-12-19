package com.showcase.algorithm;

import java.util.Hashtable;

public class Algorithm {

    public static void main1(final String[] args) {

        System.out.println("good luck");

        int[] array = {10,5,1,2,13,7,2,4,3,18,6};
        bubbleSort(array);

        Hashtable<String, String> table = new Hashtable<>();

    }

    public static void bubbleSort(int[] array) {

        for(int i = 0 ; i < array.length; i++) {
            for(int j = i + 1 ; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        print(array);
    }


    private static void print(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}
