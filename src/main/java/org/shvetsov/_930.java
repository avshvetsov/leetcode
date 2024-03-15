package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashSet;
import java.util.Set;

@LeetCode(
        number = 930,
        name = "Binary Subarrays With Sum",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Sliding Window", "Prefix Sum"}
)
public class _930 {

    public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0;

        if (goal == 0) {
            int z = 0;
            for (int i = 0; i <= nums.length; i++) {
                if (i < nums.length && nums[i] == 0) {
                    z++;
                } else {
                    for (int j = z; j > 0 ; j--) {
                        res += j;
                    }
                    z = 0;
                }
            }
            return res;
        }

        int l = 0;
        int l1 = -1;
        int r1 = -1;
        int r = -1;
        int sum = 0;
        // init set correct position
        while (r < nums.length && r1 == -1) {
            r++;
            if (r < nums.length && l1 == -1 && nums[r] == 1) l1 = r;
            if (r < nums.length) sum += nums[r];
            if (sum == goal) r1 = r;
        }
        while (r + 1 < nums.length && nums[r + 1] == 0) {
            r++;
        }

        //count res
        while (r < nums.length && l < nums.length) {
            res += (l1 - l + 1) * (r - r1 + 1);
            l = l1 + 1;
            r1 = r + 1;
            do {
                l1++;
            } while (l1 < nums.length && nums[l1] != 1);
            do {
                r++;
            } while (r + 1 < nums.length && nums[r + 1] != 1);
        }

        return res;
    }




    private final Set<Pointer> cache = new HashSet<>();

    public int numSubarraysWithSumInefficient(int[] nums, int goal) {
        return countSubArrSum(nums, goal, 0, 0, -1, true);
    }

    private int countSubArrSum(int[] nums, int goal, int sum, int l, int r, boolean lorr) {
        if (!lorr) {
            sum -= nums[l];
            l++;
        } else {
            r++;
            if (r == nums.length) {
                return 0;
            }
            sum += nums[r];
        }

        Pointer e = new Pointer(l, r);
        if (cache.contains(e)) {
            return 0;
        } else cache.add(e);

        if (l > r || l == nums.length) {
            return 0;
        }

        int res = 0;
        if (sum == goal) {
            res = 1;
        }
        return res + countSubArrSum(nums, goal, sum, l, r, false) + countSubArrSum(nums, goal, sum, l, r, true);
    }

    record Pointer(int l, int r) {

    }
}