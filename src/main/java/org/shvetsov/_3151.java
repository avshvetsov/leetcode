package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3151,
        name = "Special Array I",
        level = Level.EASY,
        tags = {"Array"}
)
public class _3151 {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] % 2 == nums[i] % 2) return false;
        }
        return true;
    }
}