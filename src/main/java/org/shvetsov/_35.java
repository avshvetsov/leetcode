package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 35,
        name = "Search Insert Position",
        level = Level.EASY,
        tags = {"Array", "Binary Search"}
)
public class _35 {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        if (nums[l] > target) return 0;
        if (nums[r] < target) return nums.length;

        while (r - l != 1) {
            int m = (l + r) / 2;
            if (nums[m] == target) return m;
            if (nums[m] < target) l = m;
            if (nums[m] > target) r = m;
        }
        if (nums[l] == target) return l;
        return r;
    }
}