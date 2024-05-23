package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 2597,
        name = "The Number of Beautiful Subsets",
        level = Level.MEDIUM,
        tags = {"Array", "Dynamic Programming", "Backtracking", "Sorting"}
)
public class _2597 {

    private int result = 0;
    private Map<Integer, Integer> valueDp = new HashMap<>();

    public int beautifulSubsets(int[] nums, int k) {
        int n = 0;
        for (int num : nums) {
            int i = num + k;
            if (!valueDp.containsKey(i)) {
                valueDp.put(i, n);
                n++;
            }
            int j = num - k;
            if (!valueDp.containsKey(j)) {
                valueDp.put(j, n);
                n++;
            }
        }
        int[] dp = new int[valueDp.size()];
        subsetHelper(nums, k, 0, dp);
        return result;
    }

    private void subsetHelper(int[] nums, int k, int start, int[] dp) {
        for (int i = start; i < nums.length; i++) {
            if (!valueDp.containsKey(nums[i]) || dp[valueDp.get(nums[i])] == 0) {
                result++;
                dp[valueDp.get(nums[i] - k)]++;
                dp[valueDp.get(nums[i] + k)]++;
                subsetHelper(nums, k, i + 1, dp);
                dp[valueDp.get(nums[i] - k)]--;
                dp[valueDp.get(nums[i] + k)]--;
            }
        }
    }

    public static class BruteforceWithDp {
        private int result = 0;
        private Map<Integer, Integer> valueDp = new HashMap<>();

        public int beautifulSubsets(int[] nums, int k) {
            int n = 0;
            for (int num : nums) {
                int i = num + k;
                if (!valueDp.containsKey(i)) {
                    valueDp.put(i, n);
                    n++;
                }
                int j = num - k;
                if (!valueDp.containsKey(j)) {
                    valueDp.put(j, n);
                    n++;
                }
            }
            int[] dp = new int[valueDp.size()];
            subsetHelper(nums, k, 0, dp);
            return result;
        }

        private void subsetHelper(int[] nums, int k, int start, int[] dp) {
            for (int i = start; i < nums.length; i++) {
                if (!valueDp.containsKey(nums[i]) || dp[valueDp.get(nums[i])] == 0) {
                    result++;
                    dp[valueDp.get(nums[i] - k)]++;
                    dp[valueDp.get(nums[i] + k)]++;
                    subsetHelper(nums, k, i + 1, dp);
                    dp[valueDp.get(nums[i] - k)]--;
                    dp[valueDp.get(nums[i] + k)]--;
                }
            }
        }
    }

    public static class Bruteforce {
        private int result = 0;

        public int beautifulSubsets(int[] nums, int k) {
            subsetHelper(nums, k, 0, new HashMap<>());
            return result;
        }

        private void subsetHelper(int[] nums, int k, int start, HashMap<Integer, Integer> blocked) {
            for (int i = start; i < nums.length; i++) {
                if (blocked.getOrDefault(nums[i], 0) == 0) {
                    result++;
                    blocked.put(nums[i] - k, blocked.getOrDefault(nums[i] - k, 0) + 1);
                    blocked.put(nums[i] + k, blocked.getOrDefault(nums[i] + k, 0) + 1);
                    subsetHelper(nums, k, i + 1, blocked);
                    blocked.put(nums[i] - k, blocked.get(nums[i] - k) - 1);
                    blocked.put(nums[i] + k, blocked.get(nums[i] + k) - 1);
                }
            }
        }
    }

}