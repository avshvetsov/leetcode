package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@LeetCode(
        number = 2461,
        name = "Maximum Sum of Distinct Subarrays With Length K",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Sliding Window"}
)
public class _2461 {

    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        int[] dp = new int[100001];
        long sum = 0;
        Set<Integer> dup = new HashSet<>();
        for (int i = 0; i < k - 1; i++) {
            dp[nums[i]]++;
            if (dp[nums[i]] > 1) dup.add(nums[i]);
            sum += nums[i];
        }
        int l = 0;
        int r = k - 1;
        while (r < nums.length) {
            sum += nums[r];
            dp[nums[r]]++;
            if (dp[nums[r]] > 1) dup.add(nums[r]);
            max = dup.isEmpty() ? Math.max(max, sum) : max;
            sum -= nums[l];
            dp[nums[l]]--;
            if (dp[nums[l]] <= 1) dup.remove(nums[l]);
            l++;
            r++;
        }
        return max;
    }


    public static class TLE {
        public long maximumSubarraySum(int[] nums, int k) {
            long max = 0;
            Map<Integer, Integer> dp = new HashMap<>();
            long sum = 0;
            for (int i = 0; i < k - 1; i++) {
                addToMap(dp, nums[i]);
                sum += nums[i];
            }
            int l = 0;
            int r = k - 1;
            while (r < nums.length) {
                sum += nums[r];
                addToMap(dp, nums[r]);
                max = subarrayContainsDublicates(dp) ? max : Math.max(max, sum);
                sum -= nums[l];
                substractFromMap(dp, nums[l]);
                l++;
                r++;
            }
            return max;
        }

        private void substractFromMap(Map<Integer, Integer> dp, int num) {
            dp.put(num, dp.getOrDefault(num, 0) - 1);
        }

        private boolean subarrayContainsDublicates(Map<Integer, Integer> dp) {
            return dp.values().stream()
                    .anyMatch(value -> value > 1);
        }

        private void addToMap(Map<Integer, Integer> dp, int num) {
            dp.put(num, dp.getOrDefault(num, 0) + 1);
        }
    }

}