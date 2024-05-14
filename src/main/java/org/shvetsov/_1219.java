package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1219,
        name = "Path with Maximum Gold",
        level = Level.MEDIUM,
        tags = {"Array", "Backtracking", "Matrix"}
)
public class _1219 {

    static int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int r, c;

    public int getMaximumGold(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        int result = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result = Math.max(result, pathFindHelper(grid, i, j));
            }
        }
        return result;
    }

    private int pathFindHelper(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row == r || col == c || grid[row][col] == 0) return 0;

        int res = 0;
        int curr = grid[row][col];
        grid[row][col] = 0;
        for (int[] dir : dirs) {
            res = Math.max(curr + pathFindHelper(grid, row + dir[0], col + dir[1]), res);
        }
        grid[row][col] = curr;
        return res;
    }
}