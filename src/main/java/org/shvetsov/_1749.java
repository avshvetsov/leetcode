package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1749,
        name = "Maximum Absolute Sum of Any Subarray",
        level = Level.MEDIUM,
        tags = {"Array", "Dynamic Programming", "Kadane’s Algorithm"}
)
public class _1749 {
    public int maxAbsoluteSum(int[] nums) {
        //Kadane’s Algorithm
        int max = nums[0];
        int maxEndingPrev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int maxEnding = Math.max(maxEndingPrev + num, num);
            max = Math.max(max, maxEnding);
            maxEndingPrev = maxEnding;
        }

        int min = nums[0];
        int minEndingPrev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int minEnding = Math.min(minEndingPrev + num, num);
            min = Math.min(min, minEnding);
            minEndingPrev = minEnding;
        }
        return Math.max(Math.abs(min), Math.abs(max));
    }
}