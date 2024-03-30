package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2962,
        name = "Count Subarrays Where Max Element Appears at Least K Times",
        level = Level.MEDIUM,
        tags = {"Array", "Sliding Window"}
)
public class _2962 {
    public long countSubarrays(int[] nums, int k) {
        long res = 0;
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int l = 0;
        int lastPosOfL = 0;
        int r = 0;
        int countOfMax = 0;
        int n = nums.length;

        while (r < nums.length) {
            if (nums[r] == max) {
                countOfMax++;
            }
            if (countOfMax >= k) {
                while (l < nums.length && countOfMax >= k) {
                    if (nums[l] == max) {
                        countOfMax--;
                    }
                    l++;
                }
                res += (long) (n - r) * (l - lastPosOfL);
                lastPosOfL = l;
            }
            r++;
        }
        return res;
    }
}