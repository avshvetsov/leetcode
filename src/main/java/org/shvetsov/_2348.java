package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2348,
        name = "Number of Zero-Filled Subarrays",
        level = Level.MEDIUM,
        tags = {"Array", "Math", "Biweekly Contest 83"}
)
public class _2348 {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        int zeros = 0;
        for (int num : nums) {
            if (num == 0) {
                zeros++;
                result += zeros;
            } else zeros = 0;
        }
        return result;
    }
}