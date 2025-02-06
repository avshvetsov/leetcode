package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 1726,
        name = "Tuple with Same Product",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Counting"}
)
public class _1726 {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> counting = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int key = nums[i] * nums[j];
                counting.put(key, counting.getOrDefault(key, 0) + 1);
            }
        }
        return counting.values().stream()
                .filter(count -> count > 1)
                .reduce(0, (res, element) -> res + (element * (element - 1)) * 4);
    }
}