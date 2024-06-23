package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Comparator;
import java.util.PriorityQueue;

@LeetCode(
        number = 1438,
        name = "Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit",
        level = Level.MEDIUM,
        tags = {"Array", "Queue", "Sliding Window", "Heap (Priority Queue)", "Ordered Set", "Monotonic Queue"}
)
public class _1438 {
    public int longestSubarray(int[] nums, int limit) {
        int result = 0;
        int l = 0, r = 0;
        PriorityQueue<Integer> min = new PriorityQueue<>(Comparator.naturalOrder());
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        while (r < nums.length) {
            if ((min.isEmpty() && max.isEmpty()) || max.peek() - min.peek() <= limit) {
                result = Math.max(result, r - l);
                min.add(nums[r]);
                max.add(nums[r]);
                r++;
            } else {
                min.remove(nums[l]);
                max.remove(nums[l]);
                l++;
            }
        }
        while (max.peek() - min.peek() > limit) {
            min.remove(nums[l]);
            max.remove(nums[l]);
            l++;
        }
        result = Math.max(result, r - l);
        return result;
    }
}