package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 2364,
        name = "Count Number of Bad Pairs",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Math", "Counting"}
)
public class _2364 {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> subtractCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int subtract = nums[i] - i;
            subtractCount.merge(subtract, 1, Integer::sum);
        }
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            int subtract = nums[i] - i;
            result += nums.length - i - 1 - subtractCount.get(subtract) + 1;
            subtractCount.merge(subtract, 1, (old, neww) -> old - neww);
        }
        return result;
    }
}