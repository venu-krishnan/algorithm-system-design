package com.algorithm.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {

        Assertions.assertArrayEquals(new int[]{0,1,2,3}, BubbleSort.bubbleSort(new int[]{2, 3, 1,0}));
        Assertions.assertArrayEquals(new int[]{0,1,2,3,4,5,6}, BubbleSort.bubbleSort(new int[]{5, 1, 6, 4,2,3,0}));

    }

}
