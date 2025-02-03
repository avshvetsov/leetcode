package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3105,
        name = "Longest Strictly Increasing or Strictly Decreasing Subarray",
        level = Level.EASY,
        tags = {"Array"}
)
public class _3105 {
    public int longestMonotonicSubarray(int[] nums) {
        int res = 1;
        int current = 1;
        int prev = nums[0];
        int increasing = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prev && increasing >= 0) {
                increasing = 1;
                current++;
            } else if (nums[i] < prev && increasing <= 0) {
                increasing = -1;
                current++;
            } else {
                increasing = Integer.compare(nums[i], prev);
                current = increasing != 0 ? 2 : 1;
            }
            res = Math.max(res, current);
            prev = nums[i];
        }
        return res;
    }
}