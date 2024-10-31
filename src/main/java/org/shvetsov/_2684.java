package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 2684,
        name = "Maximum Number of Moves in a Grid",
        level = Level.MEDIUM,
        tags = {"Array", "Dynamic Programming", "Matrix"}
)
public class _2684 {
    public int maxMoves(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            result = Math.max(result, helper(grid, dp, i, 0, -1));
        }
        return result;
    }

    private int helper(int[][] grid, int[][] dp, int r, int c, int prevVal) {
        int result = -1;
        if (r >= grid.length || r < 0 || c >= grid[0].length || c < 0) {
            return result;
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        int curr = grid[r][c];
        if (curr <= prevVal) {
            return result;
        } else {
            result = Math.max(result, helper(grid, dp, r - 1, c + 1, curr));
            result = Math.max(result, helper(grid, dp, r, c + 1, curr));
            result = Math.max(result, helper(grid, dp, r + 1, c + 1, curr));
            result++;
            dp[r][c] = result;
            return result;
        }
    }
}