package com.algorithm.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    public void testMergesort() {

        Assertions.assertArrayEquals(new int[]{0,1,2,3}, MergeSort.mergeSort(new int[]{2, 3, 1,0}));
        Assertions.assertArrayEquals(new int[]{0,1,2,3,4,5,6}, MergeSort.mergeSort(new int[]{5, 1, 6, 4,2,3,0}));

    }

}
