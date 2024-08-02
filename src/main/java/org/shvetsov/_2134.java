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
        int countOne = 0;
        for (int num : nums) {
            if (num == 1) countOne++;
        }
        int left = 0, right = countOne;
        int n = nums.length;
        int maxOneInRange = 0;
        for (int i = left; i < right; i++) {
            if (nums[i] == 1) maxOneInRange++;
        }
        int countInRange = maxOneInRange;
        while (left < n) {
            if (right >= n) {
                right = 0;
            }
            countInRange = countInRange - nums[left] + nums[right];
            left++;
            right++;
            maxOneInRange = Math.max(maxOneInRange, countInRange);
        }
        return countOne - maxOneInRange;
    }
}