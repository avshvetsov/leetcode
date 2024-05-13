package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 861,
        name = "Score After Flipping Matrix",
        level = Level.MEDIUM,
        tags = {"Array", "Greedy", "Bit Manipulation", "Matrix"}
)
public class _861 {

    public int matrixScore(int[][] grid) {
        int result = 0;
        int r = grid.length;
        int c = grid[0].length;
        for (int i = 0; i < r; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < c; j++) {
                    grid[i][j] = grid[i][j] == 1 ? 0 : 1;
                }
            }
        }

        for (int j = 1; j < c; j++) {
            int count = 0;
            for (int i = 0; i < r; i++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
            if (count * 2 < r) {
                for (int i = 0; i < r; i++) {
                    grid[i][j] = grid[i][j] == 1 ? 0 : 1;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            int currentValue = 1;
            for (int j = c - 1; j >= 0; j--) {
                if (grid[i][j] == 1) {
                    result += currentValue;
                }
                currentValue *= 2;
            }
        }
        return result;
    }
}