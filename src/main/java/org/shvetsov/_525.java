package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 525,
        name = "Contiguous Array",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Prefix Sum"}
)
public class _525 {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> sumIndex = new HashMap<>() {{
            put(0, -1);
        }};
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sumIndex.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - sumIndex.get(sum));
            } else {
                sumIndex.put(sum, i);
            }
        }
        return maxLength;
    }
}