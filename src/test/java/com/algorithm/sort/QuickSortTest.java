package com.algorithm.sort;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class QuickSortTest {

    @Test
    public void testQuickSort() {

        Assertions.assertArrayEquals(new int[]{0,1,2,3,4,5,6},
                QuickSort.sort(new int[]{6, 3, 4,2,1,5,0}));

//        Assertions.assertArrayEquals(new int[]{0,0,1,3,5,13,20,40},
//                QuickSort.sort(new int[]{20, 40, 0,13, 3, 1, 0, 5}));

    }

}
