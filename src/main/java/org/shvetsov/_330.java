package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 330,
        name = "Patching Array",
        level = Level.HARD,
        tags = {"Array", "Greedy"}
)
public class _330 {
    public int minPatches(int[] nums, int n) {
        int result = 0;
        long endNum = 1;
        int i = 0;
        while (n >= endNum) {
            if (i < nums.length && nums[i] <= endNum) {
                endNum += nums[i];
                i++;
            } else {
                endNum *= 2;
                result++;
            }
        }
        return result;
    }
}