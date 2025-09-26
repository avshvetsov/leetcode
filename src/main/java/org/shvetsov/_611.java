package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 611,
        name = "Valid Triangle Number",
        level = Level.MEDIUM,
        tags = {"Array", "Two Pointers", "Binary Search", "Greedy", "Sorting"}
)
public class _611 {
    public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
                while (k < nums.length && nums[i] + nums[j] > nums[k])
                    k++;
                count += k - j - 1;
            }
        }
        return count;
    }

    public int triangleNumberBF(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int large = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                int small1 = nums[j];
                for (int k = j - 1; k >= 0; k--) {
                    int small2 = nums[k];
                    if (small1 + small2 > large) {
                        res++;
                    } else {
                        break;
                    }
                }
            }
        }
        return res;
    }
}