package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2044,
        name = "Count Number of Maximum Bitwise-OR Subsets",
        level = Level.MEDIUM,
        tags = {"Array", "Backtracking", "Bit Manipulation", "Enumeration"}
)
public class _2044 {
    int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max |= num;
        }
        recursionCount(nums, 0, 0, max);
        return count;
    }

    private void recursionCount(int[] nums, int i, int currOR, int max) {
        if (currOR == max) {
            count++;
        }
        for (int j = i; j < nums.length; j++) {
            recursionCount(nums, j + 1, currOR | nums[j], max);
        }
    }
}