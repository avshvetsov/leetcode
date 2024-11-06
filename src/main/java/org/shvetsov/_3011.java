package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3011,
        name = "Find if Array Can Be Sorted",
        level = Level.MEDIUM,
        tags = {"Array", "Bit Manipulation", "Sorting"},
        resultTime = 1,
        beatsTime = 100.00,
        resultSpace = 44.00,
        beatsSpace = 92.45
)
public class _3011 {
    public boolean canSortArray(int[] nums) {
        int prevBitCount = Integer.bitCount(nums[0]);
        int prevMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (Integer.bitCount(num) == prevBitCount) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            } else {
                if (min < prevMax) {
                    return false;
                }
                prevMax = max;
                max = num;
                min = num;
                prevBitCount = Integer.bitCount(num);
            }
        }
        return min > prevMax;
    }
}