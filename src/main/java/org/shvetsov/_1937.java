package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 1937,
        name = "Maximum Number of Points with Cost",
        level = Level.MEDIUM,
        tags = {"Array", "Dynamic Programming"},
        todo = {"Brute force"}
)
public class _1937 {
    public long maxPoints(int[][] points) {
        return -1;
    }

    public static class BruteForce {
        public long maxPoints(int[][] points) {
            long[] dp = new long[points[0].length];
            for (int i = 0; i < points[0].length; i++) {
                dp[i] = points[0][i];
            }
            for (int i = 1; i < points.length; i++) {
                long[] dpNew = new long[points[0].length];
                for (int j = 0; j < points[i].length; j++) {
                    long currMax = points[i][j];
                    for (int d = 0; d < dp.length; d++) {
                        currMax = Math.max(currMax, points[i][j] + dp[d] - Math.abs(d - j));
                    }
                    dpNew[j] = currMax;
                }
                dp = dpNew;
            }
            long res = Long.MIN_VALUE;
            for (long i : dp) {
                res = Math.max(res, i);
            }
            return res;
        }
    }
}