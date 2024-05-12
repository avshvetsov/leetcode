package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2373,
        name = "Largest Local Values in a Matrix",
        level = Level.EASY,
        tags = {"Array", "Matrix"}
)
public class _2373 {

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] offsets = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int[][] res = new int[n - 2][n - 2];
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int max = Integer.MIN_VALUE;
                for (int[] offset : offsets) {
                    max = Math.max(max, grid[i + offset[0]][j + offset[1]]);
                }
                res[i - 1][j - 1] = max;
            }
        }
        return res;
    }
}