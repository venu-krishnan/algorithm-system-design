package com.algorithm.sort;

public class QuickSort {

    /**
     * Big O
     * runtime: O(n log n)
     * space: O(n)
     */
    public static int[] sort(int[] array) {

        return quickSort(array, 0, array.length-1);
    }

    private static int[] quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
        return arr;
    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = begin;

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
                i++;
            }
        }
        int swapTemp = arr[i];
        arr[i] = arr[end];
        arr[end] = swapTemp;
        return i;
    }


}
