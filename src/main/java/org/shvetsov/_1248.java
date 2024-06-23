package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@LeetCode(
        number = 1248,
        name = "Count Number of Nice Subarrays",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Math", "Sliding Window"}
)
public class _1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        List<int[]> countBA = new LinkedList<>();
        int prevLastOdd = -1;
        int lastOdd = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                if (lastOdd != -1) {
                    int[] ba = new int[]{lastOdd - prevLastOdd - 1, i - lastOdd - 1};
                    countBA.add(ba);
                    prevLastOdd = lastOdd;
                    lastOdd = i;
                } else {
                    lastOdd = i;
                }
            }
        }
        int[] ba = new int[]{lastOdd - prevLastOdd - 1, nums.length - lastOdd - 1};
        countBA.add(ba);

        int l = 0, r = k - 1, res = 0;
        while (r < countBA.size()) {
            res += (countBA.get(l)[0] + 1) * (countBA.get(r)[1] + 1);
            l++;
            r++;
        }
        return res;
    }

    public static class PrefixSum {
        public int numberOfSubarrays(int[] nums, int k) {
            int result = 0;
            int currSum = 0;
            Map<Integer, Integer> prefixSum = new HashMap<>();
            prefixSum.put(currSum, 1);
            for (int num : nums) {
                currSum += num % 2;
                if (prefixSum.containsKey(currSum - k)) {
                    result += prefixSum.get(currSum - k);
                }
                prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);
            }
            return result;
        }
    }
}