package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 713,
        name = "Subarray Product Less Than K",
        level = Level.MEDIUM,
        tags = {"Array", "Sliding Window"}
)
public class _713 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int prod = 1;
        int res = 0;
        while (r < nums.length) {
            prod *= nums[r];
            while (prod >= k) {
                prod /= nums[l];
                l++;
            }
            res = res + r - l + 1;
            r++;
        }
        return res;
    }


    public int numSubarrayProductLessThanKInefficient(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int prod = nums[l];
        int res = 0;
        while (l < nums.length - 1) {
            if (prod < k) {
                res++;
                r++;
                if (r < nums.length) {
                    prod *= nums[r];
                } else {
                    l++;
                    r = l;
                    prod = nums[l];
                }
            } else {
                if (l < r) {
                    l++;
                    r = l;
                    prod = nums[l];
                } else {
                    r++;
                    l++;
                    prod = nums[l];
                }
            }

        }
        if (prod < k) {
            res++;
        }
        return res;
    }
}