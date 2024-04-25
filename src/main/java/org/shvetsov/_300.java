package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 300,
        name = "Longest Increasing Subsequence",
        level = Level.MEDIUM,
        tags = {"Array", "Binary Search", "Dynamic Programming"}
)
public class _300 {

    public int lengthOfLIS(int[] nums) {
        int result = 0;
        int[] dp = new int[nums.length];
        for (int curr : nums) {
            int j = result - 1;
            if (j < 0 || curr > dp[j]) {
                dp[result] = curr;
                result++;
            } else {
                while (j >= 0 && curr < dp[j]) {
                    j--;
                }
                if (j < 0 || curr > dp[j]) {
                    dp[j + 1] = curr;
                }
            }
        }
        return result;
    }
}