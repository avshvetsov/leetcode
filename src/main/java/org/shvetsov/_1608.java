package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 1608,
        name = "Special Array With X Elements Greater Than or Equal X",
        level = Level.EASY,
        tags = {"Array", "Binary Search", "Sorting"}
)
public class _1608 {

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        for (int i = 1; i <= nums.length; i++) {
            while (j < nums.length && nums[j] < i) {
                j++;
            }
            if (i == nums.length - j) return i;
            else if (i > nums.length - j) break;
        }
        return -1;
    }
}