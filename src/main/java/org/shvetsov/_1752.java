package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;
@LeetCode(
        number = 1752,
        name = "Check if Array Is Sorted and Rotated",
        level = Level.EASY,
        tags = {"Array"}
)
public class _1752 {
    public boolean check(int[] nums) {
        int length = nums.length;
        int m = 0;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < length * 2; i++) {
            if (nums[i % length] >= prev) {
                m++;
            } else {
                m = 1;
            }
            if (m == length) {
                return true;
            }
            prev = nums[i % length];
        }
        return false;
    }
}