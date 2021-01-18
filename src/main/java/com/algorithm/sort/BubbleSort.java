package com.algorithm.sort;


public class BubbleSort {

    /**
     * Big O
     * runtime: O(n^2)
     * space: O(1)
     */
    public static int[] bubbleSort(int[] array) {

        for(int i = 0 ; i < array.length; i++) {
            for(int j = i + 1 ; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
