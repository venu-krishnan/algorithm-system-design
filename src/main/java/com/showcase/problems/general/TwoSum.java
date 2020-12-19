package com.showcase.problems.general;

import java.util.HashMap;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target
 * number.
 * The function twoSum should return indices of the two numbers such that they add up to
 * the target, where index1 must be less than index2. Please note that your returned answers
 * (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution
 *
 */

public class TwoSum {
    /** BruteForce
     *  runtime: O(N * N -1)
     *  space: O(2) //return indexes
     */
    public static int[] twoSumBruteForce(int[] numbers, int targetNumber){
        for(int i=0; i < numbers.length; i++) {
            for(int j=i+1; j < numbers.length; j++) {
                if((numbers[i] + numbers[j]) == targetNumber) {
                    return new int[]{i+1, j+1}; //increment by 1 aw expected indexes are not zero-based
                }
            }
        }
        return new int[]{};
    }

    /** Using Map to store the calc to avoid inner loop
     *  runtime: O(N)
     *  space: O(N) //HashMap using
     */
    public static int[] twoSumUsingMap(int[] numbers, int targetNumber) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< numbers.length; i++) {

            if(map.containsKey(numbers[i])){
                return new int[]{map.get(numbers[i])+1, i+1};
            } else {
                map.put(targetNumber - numbers[i], i);
            }
        }

        return new int[]{};
    }


    /** Using two pointers with assumption that array is sorted
     *  runtime: O(N)
     *  space: O(1)
     */
    public static int[] twoSumTwpPointer(int[] numbers, int targetNumber) {
        int head = 0;
        int tail = numbers.length-1;
        while(head < tail) {
            if((numbers[head] + numbers[tail]) < targetNumber)
                head++;
            else if((numbers[head] + numbers[tail]) > targetNumber)
                tail--;
            else if((numbers[head] + numbers[tail]) == targetNumber)
                return new int[]{head+1, tail+1};
        }
        return new int[]{};
    }

    /**
     * using binary search approach
     * Big O
     * runtime - O(n log n)
     * space - O(1)
     */
    public static int[] twoSummaryBinarySearch(int[] numbers, int target) {

        for(int i=0; i< numbers.length; i++) {
            int lastIndex = binarySearch(numbers, target-numbers[i], i+1);
            if(lastIndex != -1){
                return new int[] {i+1, lastIndex+1};
            }
        }
        return new int[] {};
    }

    private static int binarySearch(int[] numbers, int numToBeFound, int start) {
        int left = start;
        int right = numbers.length-1;
        while(left <= right){
            int middle = (left+right)/2;
            if(numToBeFound < numbers[middle]){
                right = middle-1;
            } else if(numToBeFound > numbers[middle]){
                left = middle+1;
            } else if(numToBeFound == numbers[middle]){
                return middle;
            }
        }
        return -1;
    }


}
