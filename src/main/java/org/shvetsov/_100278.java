package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 100278,
        name = "Right Triangles",
        level = Level.MEDIUM,
        tags = {}
)
public class _100278 {
    public long numberOfRightTriangles(int[][] grid) {
        long result = 0;
        int[] rowCnts = new int[grid.length];
        int[] colCnts = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    rowCnts[i]++;
                    colCnts[j]++;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (rowCnts[i] > 1 && colCnts[j] > 1) {
                        result += (rowCnts[i] - 1) * (colCnts[j] - 1);
                    }
                }
            }
        }
        return result;
    }
}