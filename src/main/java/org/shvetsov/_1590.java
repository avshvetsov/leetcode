package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 1590,
        name = "Make Sum Divisible by P",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Prefix Sum"}
)
public class _1590 {
    public int minSubarray(int[] nums, int p) {
        long[] prefixSum = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        int targetSumForRemove = (int) (prefixSum[prefixSum.length - 1] % p);
        if (targetSumForRemove == 0) return 0;

        int minLength = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for (int i = 1; i < prefixSum.length; i++) {
            long neededSum = prefixSum[i] - targetSumForRemove + p;
            if (map.containsKey((int) (neededSum % p))) {
                minLength = Math.min(minLength, i - map.get((int) (neededSum % p)));
            }
            map.put((int) (prefixSum[i] % p), i);
        }
        return minLength == nums.length ? -1 : minLength;
    }

    public static class BruteForce {
        public int minSubarray(int[] nums, int p) {
            long[] prefixSum = new long[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                prefixSum[i + 1] = prefixSum[i] + nums[i];
            }
            int reminder = (int) (prefixSum[prefixSum.length - 1] % p);
            if (reminder == 0) return 0;

            for (int i = 1; i < prefixSum.length - 1; i++) {
                int l = 0;
                int r = l + i;
                while (r < prefixSum.length) {
                    if ((prefixSum[r] - prefixSum[l]) % p == reminder) return i;
                    l++;
                    r++;
                }
            }
            return -1;
        }
    }
}