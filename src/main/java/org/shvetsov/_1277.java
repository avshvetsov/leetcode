package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1277,
        name = "Count Square Submatrices with All Ones",
        level = Level.MEDIUM,
        tags = {"Array", "Dynamic Programming", "Matrix", "Weekly Contest 165"}
)
public class _1277 {
    public int countSquares(int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    result += countSquaresFrom(matrix, i, j);
                }
            }
        }
        return result;
    }

    private int countSquaresFrom(int[][] matrix, int i, int j) {
        int dist = 1;
        int m = matrix.length;
        int n = matrix[0].length;
        while (true) {
            boolean isSquare = true;
            for (int k = i; k <= i + dist; k++) {
                int l = j + dist;
                if (k >= m || l >= n || matrix[k][l] != 1) isSquare = false;
            }
            for (int l = j; l <= j + dist; l++) {
                int k = i + dist;
                if (k >= m || l >= n || matrix[k][l] != 1) isSquare = false;
            }
            if (!isSquare) break;
            dist++;
        }
        return dist;
    }
}