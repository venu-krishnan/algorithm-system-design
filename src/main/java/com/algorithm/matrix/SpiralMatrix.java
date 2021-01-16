package com.algorithm.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m ✕ n elements (m rows, n columns), return all elements of the
 * matrix in spiral order.
 * For example, given the following matrix:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 *
 * Solution should return [1,2,3,6,9,8,7,4,5]
 *
 */
public class SpiralMatrix {

    /**
     * Big O
     * runtime: O(n)
     * space: O(1)
     */
    public static List<Integer> spiralOrder(int[][] matrix){

        List<Integer> returnList = new ArrayList<>();
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int totalCount = rowSize * colSize;

        int row = 0, col =0;
        System.out.println("totalCount:"+totalCount+" returnList.size:"+returnList.size());

        while(totalCount != returnList.size()) {
            for(int c = 0; c< colSize; c++)
                returnList.add(matrix[row][col++]);
            col--;row++;
            rowSize--;
            for(int r = 0; r< rowSize; r++)
                returnList.add(matrix[row++][col]);
            row--;col--;
            colSize--;
            for(int c = 0; c< colSize; c++)
                returnList.add(matrix[row][col--]);
            col++;row--;
            rowSize--;
            for(int r = 0; r< rowSize; r++)
                returnList.add(matrix[row--][col]);
            row++;col++;
            colSize--;
        }
        System.out.println("retList:"+returnList.size());
        return returnList;
    }

}
