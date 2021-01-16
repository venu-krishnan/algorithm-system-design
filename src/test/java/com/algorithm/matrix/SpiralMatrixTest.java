package com.algorithm.matrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpiralMatrixTest {

    @Test
    public void testSpiralOrder(){

        //1
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> actual = SpiralMatrix.spiralOrder(matrix);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(6);
        expected.add(9);
        expected.add(8);
        expected.add(7);
        expected.add(4);
        expected.add(5);
        assertResult(actual, expected);

        //2
        matrix = new int[][]{{1, 2, 3,4}, {5, 6,7,8}, {9,10,11,12}};
        actual = SpiralMatrix.spiralOrder(matrix);

        expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(8);
        expected.add(12);
        expected.add(11);
        expected.add(10);
        expected.add(9);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        assertResult(actual, expected);
    }

    private void assertResult(List<Integer> actual, List<Integer> expected) {
        System.out.println("actual:"+actual);
        assertTrue(actual.size() == expected.size());
        for(int i=0; i< expected.size(); i++) {
            assertTrue(expected.get(i).equals(actual.get(i)));
        }
    }
}
