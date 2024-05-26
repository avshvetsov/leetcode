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
    public int checkRecord(int n) {
        int MOD = 1_000_000_007;
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

    public int helper(int n, int a, int l) {
        if (n == 0) return 1;
        long res = 0;
        if (a > 0) {
            res += helper(n - 1, 0, 2);
        }
        if (l > 0) {
            res += helper(n - 1, a, --l);
        }
        res += helper(n - 1, a, 2);
        return (int) res % 1_000_000_007;
    }
}