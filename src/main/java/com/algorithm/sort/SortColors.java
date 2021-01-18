package com.algorithm.sort;

/**
 * Given an array nums with n objects colored red, white, or blue,
 * sort them in-place so that objects of the same color are adjacent,
 * with the colors in the order red, white, and blue.
 * Here, we will use the integers 0, 1, and 2 to
 * represent the color red, white, and blue respectively.
 *
 * Follow up:
 *
 * Could you solve this problem without using the library's sort function?
 * Could you come up with a one-pass algorithm using only O(1) constant space?
 *
 * Example 1:
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Example 2:
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 * Example 3:
 * Input: nums = [0]
 * Output: [0]
 * Example 4:
 * Input: nums = [1]
 * Output: [1]
 */
public class SortColors {

    /**
     * Big O
     * runtime: O(n log n)
     * space: O(n)
     * This example uses Quick sort
     */
    public static void sort(int[] array) {

        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(int[] array, int begin, int end) {
        if(begin < end) {
            int partitionIndex = partition(array, begin, end);
            quickSort(array, begin, partitionIndex-1);
            quickSort(array, partitionIndex+1, end);
        }
    }

    private static int partition(int[]  array, int begin, int end) {
        int pivot = array[end];

        int i = begin;
        for(int j=begin; j< end; j++) {
            if(array[j] <= pivot) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

}
