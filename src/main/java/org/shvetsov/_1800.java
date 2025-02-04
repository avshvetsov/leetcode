package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1800,
        name = "Maximum Ascending Subarray Sum",
        level = Level.EASY,
        tags = {"Array"}
)
public class _1800 {
    public int maxAscendingSum(int[] nums) {
        int result = nums[0];
        int prev = nums[0];
        int sum = prev;
        for (int i = 1; i < nums.length; i++) {
            if (prev < nums[i]) {
                sum += nums[i];
            } else {
                result = Math.max(result, sum);
                sum = nums[i];
            }
            result = Math.max(result, sum);
            prev = nums[i];
        }
        return result;
    }
}