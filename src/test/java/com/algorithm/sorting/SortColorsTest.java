package com.algorithm.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortColorsTest {

    @Test
    public void testSortColors() {

        int[] input = new int[]{6, 3, 4,2,1,5,0};
        SortColors.sort(input);
        Assertions.assertArrayEquals(new int[]{0,1,2,3,4,5,6}, input);

        input = new int[]{20, 40, 0, 13, 3, 1, 0, 5};
        SortColors.sort(input);
        Assertions.assertArrayEquals(new int[]{0,0,1,3,5,13,20,40}, input);

    }

}
