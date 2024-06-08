package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 974,
        name = "Subarray Sums Divisible by K",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Prefix Sum"}
)
public class _974 {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % k;
            if (sum < 0) {
                sum += k;
            }
            if (map.containsKey(sum)) {
                result += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }


    public int subarraysDivByKVersion2(int[] nums, int k) {
        int[] prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
            if (prefixSum[i + 1] < 0) {
                prefixSum[i + 1] = (prefixSum[i + 1] % k) + k;
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int leftOfDivide = prefixSum[i + 1] % k;
            if (map.containsKey(leftOfDivide)) {
                result += map.get(leftOfDivide);
            }
            map.put(leftOfDivide, map.getOrDefault(leftOfDivide, 0) + 1);
        }
        return result;
    }
}