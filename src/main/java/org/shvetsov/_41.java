package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 41,
        name = "First Missing Positive",
        level = Level.HARD,
        tags = {"Array", "Hash Table"}
)
public class _41 {

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr <= nums.length && curr > 0 && curr != nums[curr - 1]) {
                nums[i] = nums[curr - 1];
                nums[curr - 1] = curr;
                i--;
            }
        }
        int res = 0;
        while (res < nums.length && nums[res] == res + 1) {
            res++;
        }
        return res + 1;
    }
}