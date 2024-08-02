package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2134,
        name = "Minimum Swaps to Group All 1's Together II",
        level = Level.MEDIUM,
        tags = {"Array", "Sliding Window"}
)
public class _2134 {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int totalOne = 0;
        for (int num : nums) {
            totalOne += num;
        }

        int left = 0, right = totalOne;
        int maxOneInRange = 0;
        for (int i = left; i < right; i++) {
            maxOneInRange += nums[i];
        }
        int countOneInRange = maxOneInRange;
        while (left < n) {
            if (right >= n) {
                right = 0;
            }
            countOneInRange = countOneInRange - nums[left] + nums[right];
            left++;
            right++;
            maxOneInRange = Math.max(maxOneInRange, countOneInRange);
        }
        return totalOne - maxOneInRange;
    }
}