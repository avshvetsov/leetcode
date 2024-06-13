package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 75,
        name = "Sort Colors",
        level = Level.MEDIUM,
        tags = {"Array", "Two Pointers", "Sorting"}
)
public class _75 {
    public void sortColors(int[] nums) {
        int l = 0, m = 0, r = nums.length - 1;
        while (m <= r) {
            if (nums[m] == 0) {
                swap(nums, m, l);
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else if (nums[m] == 2) {
                swap(nums, m, r);
                r--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static class CountingSort {
        public void sortColors(int[] nums) {
            int[] count = new int[3];
            for (int num : nums) {
                count[num]++;
            }
            int j = 0;
            for (int i = 0; i < count.length; i++) {
                Arrays.fill(nums, j, j + count[i], i);
                j += count[i];
            }
        }
    }
}