package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@LeetCode(
        number = 1380,
        name = "Lucky Numbers in a Matrix",
        level = Level.EASY,
        tags = {"Array", "Matrix"}
)
public class _1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Set<Integer> minRow = new HashSet<>();
        Set<Integer> maxCol = new HashSet<>();
        for (int[] row : matrix) {
            int min = Integer.MAX_VALUE;
            for (int i : row) {
                min = Math.min(min, i);
            }
            minRow.add(min);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            maxCol.add(max);
        }
        minRow.retainAll(maxCol);
        return new ArrayList<>(minRow);
    }
}