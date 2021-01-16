package com.algorithm.integer;

import com.algorithm.integer.FindMissingPositiveInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingPositiveIntegerTest {

    @Test
    public void testFindKthPositive() {

        assertEquals(9, FindMissingPositiveInteger.findKthPositive(new int[]{2,3,4,7,11}, 5));
        assertEquals(6, FindMissingPositiveInteger.findKthPositive(new int[]{1,2,3,4}, 2));

    }

}
