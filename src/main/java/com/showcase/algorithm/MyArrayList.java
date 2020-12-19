package com.showcase.algorithm;

import java.lang.IllegalArgumentException;

public class MyArrayList<E> {

    private int bucketSize;
    private int size;
    private final float resizeFactor = 0.7f; //70%
    private float threshold;

    private Object[] array = null;

    public MyArrayList() {
        bucketSize = 10;
        size = 0 ;
        threshold = 0;
        array = new Object[bucketSize];
        for(int i = 0; i < bucketSize; i++) {
            array[i] = null;
        }
    }

    public void add(E value) {
        array[size++] = value;
        threshold = (1.0f * size) / bucketSize;
        resizeUponThreshold();
    }

    public void add(int index, E value) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Index cannot be less than 0 or greater than " + size);
        }
        for(int i = size; i > index; i--) {
            array[i] = array[i - 1]; //right shift elements
        }
        array[index] = value;
        ++size;
        threshold = (1.0f * size) / bucketSize;
        resizeUponThreshold();
    }

    private void resizeUponThreshold() {
        if(threshold >= resizeFactor) {
            int previousBucketSize = bucketSize;
            Object[] tempArray = array;
            bucketSize = bucketSize * 2; //extend it by 2 fold
            array = new Object[bucketSize];
            //copy entries from previous array to new array
            for(int i = 0; i < previousBucketSize; i++) {
                array[i] = tempArray[i];
            }
            //initialize new array with null for the extended size
            for(int i = previousBucketSize; i < bucketSize; i++) {
                array[i] = null;
            }
            threshold = (1.0f * size) / bucketSize;
        }
    }


    public void set(int index, E value) {
        if(index < 0 ||index >= size) {
            throw new IllegalArgumentException("Index cannot be less than 0 or greater than " + size);
        }
        array[index] = value;
    }

    public E get(int index) {
        if(index < 0 ||index >= size) {
            throw new IllegalArgumentException("Index cannot be less than 0 or greater than " + size);
        }
        return (E) array[index];
    }

    public int getSize() {
        return size;
    }

    public E remove(int index) {
        if(index < 0 ||index >= size) {
            throw new IllegalArgumentException("Index cannot be less than 0 or greater than " + size);
        }
        Object returnObj = array[index];
        for(int i = index; i < size-1; i++) {
            array[i] = array[i + 1]; //left shift the elements
        }
        array[size - 1] = null; //set null to last index
        --size;
        return (E) returnObj;
    }

    //for debugging
    private void printArray() {
        int i = 0;
        for(Object obj: array) {
            System.out.print(" "+(i++)+":"+obj);
        }
        System.out.println();
    }

}
