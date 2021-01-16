package com.algorithm.integer;

/**
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 * Find the kth positive integer that is missing from this array.
 *
 * Input: arr = [2,3,4,7,11], k = 5
 * Output: 9
 * Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
 *
 *Input: arr = [1,2,3,4], k = 2
 * Output: 6
 * Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 *
 */
public class FindMissingPositiveInteger {

    /**
     * Big O
     * runtime: O(n)
     * space: O(1)
     *
     */
    public static int findKthPositive(int[] arr, int k) {

        int integerVal=1, increment =0, kcount=0;

        while(true) {
            if(increment < arr.length) {
                if(integerVal != arr[increment])
                    kcount++;
                else
                    increment++;
            } else {
                kcount++;
            }
            if (k == kcount)
                return integerVal;
            integerVal++;
        }
    }

}
