package com.algorithm;

import com.algorithm.TwoSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {

    @Test
    public void testTwoSum() {

        int[] numbers = {3,2,4,5,6};
        int targetNumber = 8;
        int[] expectedIndex = {1,4}; //8
        int[] returnIndex = TwoSum.twoSumBruteForce(numbers, targetNumber);
        assertResults(expectedIndex, returnIndex);

        returnIndex = TwoSum.twoSumUsingMap(numbers, targetNumber);
        assertResults(expectedIndex, returnIndex);

        //assuming array is sported
        numbers = new int[]{1,3,4,5,8,12};
        targetNumber = 9;
        expectedIndex = new int[]{1,5};
        returnIndex = TwoSum.twoSumTwpPointer(numbers, targetNumber);
        assertResults(expectedIndex, returnIndex);

        targetNumber = 13;
        expectedIndex = new int[]{1,6};
        returnIndex = TwoSum.twoSumTwpPointer(numbers, targetNumber);
        assertResults(expectedIndex, returnIndex);

        targetNumber = 4;
        expectedIndex = new int[]{1,2};
        returnIndex = TwoSum.twoSumTwpPointer(numbers, targetNumber);
        assertResults(expectedIndex, returnIndex);

        //binarySearch approach
        numbers = new int[]{1,3,4,5,8,12};
        targetNumber = 9;
        expectedIndex = new int[]{1,5};
        returnIndex = TwoSum.twoSummaryBinarySearch(numbers, targetNumber);
        assertResults(expectedIndex, returnIndex);

        targetNumber = 13;
        expectedIndex = new int[]{1,6};
        returnIndex = TwoSum.twoSummaryBinarySearch(numbers, targetNumber);
        System.out.println(returnIndex[0]+","+returnIndex[1]);
        assertResults(expectedIndex, returnIndex);

        targetNumber = 4;
        expectedIndex = new int[]{1,2};
        returnIndex = TwoSum.twoSummaryBinarySearch(numbers, targetNumber);
        assertResults(expectedIndex, returnIndex);

        targetNumber = 20;
        expectedIndex = new int[]{5,6};
        returnIndex = TwoSum.twoSummaryBinarySearch(numbers, targetNumber);
        assertResults(expectedIndex, returnIndex);

    }

    private void assertResults(int[] expectedIndex, int[] returnIndex) {
        assertEquals(expectedIndex[0], returnIndex[0]);
        assertEquals(expectedIndex[1], returnIndex[1]);
    }
}
