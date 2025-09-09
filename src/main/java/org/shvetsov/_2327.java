package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 2327,
        name = "Number of People Aware of a Secret",
        level = Level.MEDIUM,
        tags = {"Dynamic Programming", "Queue", "Simulation", "Weekly Contest 300"}
)
public class _2327 {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        final int MOD = 1000000007;
        int[] dp = new int[forget];
        dp[0] = 1;
        for (int i = 2; i <= n; i++) {
            int shares = 0;
            for (int j = forget - 1; j > 0; j--) {
                dp[j] = dp[j - 1];
                if (j >= delay) {
                    shares += dp[j];
                    shares %= MOD;
                }
            }
            dp[0] = shares;
        }
        return (int) (Arrays.stream(dp).mapToLong(value -> (long) value).sum() % MOD);
    }
}