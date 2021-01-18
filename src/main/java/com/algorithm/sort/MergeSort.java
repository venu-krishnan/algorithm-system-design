package com.algorithm.sort;

public class MergeSort {

    /**
     * Big O
     * runtime: O(n log n)
     * space: O(n log n)
     */
    public static int[] mergeSort(int[] array) {
        int n = array.length;
        if (n<2)
            return array;
        int mid = n/2;

        int[] arrA = new int[mid];
        int[] arrB = new int[n-mid];
        int c = 0;
        for(int a = 0; a< mid; a++)
            arrA[a] = array[a];
        for(int b = mid; b< n; b++)
            arrB[c++] = array[b];
        arrA = mergeSort(arrA);
        arrB = mergeSort(arrB);

        return merge(arrA, arrB);
    }

    private static int[] merge(int[] arrA, int[] arrB) {
        int a = 0, b=0, c=0;
        int[] arrC = new int[arrA.length + arrB.length];

        while(a< arrA.length && b < arrB.length) {
            if(arrA[a] < arrB[b])
                arrC[c++] = arrA[a++];
            else
                arrC[c++] = arrB[b++];
        }
        while(a< arrA.length) {
            arrC[c++] = arrA[a++];
        }
        while(b< arrB.length) {
            arrC[c++] = arrB[b++];
        }
        return arrC;
    }



}
