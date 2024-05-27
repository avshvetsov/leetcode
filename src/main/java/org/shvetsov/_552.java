package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 552,
        name = "Student Attendance Record II",
        level = Level.HARD,
        tags = {"Dynamic Programming"}
)
public class _552 {

    public static final int MOD = 1_000_000_007;

    public int checkRecord(int n) {
        int MOD = _552.MOD;
        int[][] dp = new int[2][3];
        for (int[] ints : dp) {
            Arrays.fill(ints, 1);
        }
        while (n > 0) {
            int a = 1;
            int[][] newDp = new int[2][3];
            while (a >= 0) {
                int l = 2;
                while (l >= 0) {
                    newDp[a][l] = dp[a][2];
                    if (a > 0) {
                        newDp[a][l] += dp[0][2];
                        newDp[a][l] %= MOD;
                    }
                    if (l > 0) {
                        newDp[a][l] += dp[a][l - 1];
                        newDp[a][l] %= MOD;
                    }
                    l--;
                }
                a--;
            }
            dp = newDp;
            n--;
        }
        return dp[1][2];
    }


    public static class Recursion {

        public int checkRecord(int n) {
            int[][][] dp = new int[n][2][3];
            return helper(dp, n, 1, 2);
        }

        public int helper(int[][][] dp, int n, int a, int l) {
            if (n == 0) return 1;
            if (dp[n - 1][a][l] > 0) return dp[n - 1][a][l];

            int withP = helper(dp, n - 1, a, 2);
            int withA = 0;
            if (a > 0) {
                withA += helper(dp, n - 1, a - 1, 2);
            }
            int withL = 0;
            if (l > 0) {
                withL += helper(dp, n - 1, a, l - 1);
            }
            int res = ((withP + withA) % MOD + withL) % MOD;
            dp[n - 1][a][l] = res;
            return res;
        }
    }
}