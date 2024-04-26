package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 1289,
        name = "Minimum Falling Path Sum II",
        level = Level.HARD,
        tags = {"Array", "Dynamic Programming", "Matrix"}
)
public class _1289 {

    public int minFallingPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int[][] lastMin = new int[2][2];
        Arrays.fill(lastMin[0], Integer.MAX_VALUE);
        Arrays.fill(lastMin[1], -1);
        for (int i = 0; i < grid.length; i++) {
            int[][] currMin = new int[2][2];
            Arrays.fill(currMin[0], Integer.MAX_VALUE);
            Arrays.fill(currMin[1], -1);
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = grid[i][j];
                    checkMin(dp[i][j], j, currMin);
                } else {
                    dp[i][j] = grid[i][j] + (j != lastMin[1][0] ? lastMin[0][0] : lastMin[0][1]);
                    checkMin(dp[i][j], j, currMin);
                }
            }
            lastMin = currMin;
        }
        return lastMin[0][0];
    }

    public void checkMin(int currVal, int currCol, int[][] grid) {
        if (currVal < grid[0][0]) {
            grid[0][1] = grid[0][0];
            grid[1][1] = grid[1][0];
            grid[0][0] = currVal;
            grid[1][0] = currCol;
        } else if (currVal < grid[0][1]) {
            grid[0][1] = currVal;
            grid[1][1] = currCol;
        }
    }



    public static class WithClass {
        public int minFallingPathSum(int[][] grid) {
            int[][] dp = new int[grid.length][grid[0].length];
            MinValues lastMin = new MinValues(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
            for (int i = 0; i < grid.length; i++) {
                MinValues currMin = new MinValues(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
                for (int j = 0; j < grid[0].length; j++) {
                    if (i == 0) {
                        dp[i][j] = grid[i][j];
                        checkMin(dp[i][j], j, currMin);
                    } else {
                        dp[i][j] = grid[i][j] + (j != lastMin.index ? lastMin.first : lastMin.second);
                        checkMin(dp[i][j], j, currMin);
                    }
                }
                lastMin = currMin;
            }
            return lastMin.first;
        }

        public void checkMin(int currVal, int currCol, MinValues minValues) {
            if (currVal < minValues.first) {
                minValues.second = minValues.first;
                minValues.first = currVal;
                minValues.index = currCol;
            } else if (currVal < minValues.second) {
                minValues.second = currVal;

            }
        }

        public static class MinValues {
            int first;
            int second;
            int index;

            public MinValues(int first, int second, int index) {
                this.first = first;
                this.second = second;
                this.index = index;
            }
        }
    }
}