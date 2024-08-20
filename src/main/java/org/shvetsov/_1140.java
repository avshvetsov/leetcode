package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1140,
        name = "Stone Game II",
        level = Level.MEDIUM,
        tags = {"Array", "Math", "Dynamic Programming", "Prefix Sum", "Game Theory"}
)
public class _1140 {
    public int stoneGameII(int[] piles) {
        int[][] dp = new int[piles.length + 1][piles.length + 1];
        int[] prefixSum = new int[piles.length + 1];
        for (int i = 1; i <= piles.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + piles[i - 1];
        }
        int pos = 0;
        int m = 1;
        return helper(piles, pos, m, prefixSum, dp);
    }

    private int helper(int[] piles, int pos, int m, int[] prefixSum, int[][] dp) {
        if (pos >= piles.length) {
            return 0;
        }
        if (dp[pos][m] != 0) {
            return dp[pos][m];
        }
        int res = 0;
        for (int x = 1; x <= m * 2; x++) {
            int endPos = Math.min(pos + x, piles.length - 1);
            int currPlayerSum = prefixSum[endPos] - prefixSum[pos];
            int nextPlayerResults = helper(piles, pos + x, Math.max(x, m), prefixSum, dp);
            currPlayerSum += prefixSum[prefixSum.length - 1] - prefixSum[endPos] - nextPlayerResults;
            res = Math.max(res, currPlayerSum);
        }
        dp[pos][m] = res;
        return res;
    }
}