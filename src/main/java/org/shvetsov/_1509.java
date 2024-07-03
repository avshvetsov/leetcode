package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

@LeetCode(
        number = 1509,
        name = "Minimum Difference Between Largest and Smallest Value in Three Moves",
        level = Level.MEDIUM,
        tags = {"Array", "Greedy", "Sorting"}
)
public class _1509 {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if (n < 5) return 0;
        int[][] options = new int[][]{{3, 0}, {2, 1}, {1, 2}, {0, 3}};
        Arrays.sort(nums);
        int diff = nums[n - 1] - nums[0];
        for (int[] option : options) {
            diff = Math.min(diff, nums[n - option[0] - 1] - nums[option[1]]);
        }
        return diff;
    }

    //time complexity - O(n)
    public static class LinearTimeComplexity {
        public int minDifference(int[] nums) {
            int n = nums.length;
            if (n < 5) return 0;
            PriorityQueue<Integer> bottomQueue = new PriorityQueue<>(4, Comparator.naturalOrder());
            PriorityQueue<Integer> topQueue = new PriorityQueue<>(4, Comparator.reverseOrder());
            for (int i : nums) {
                bottomQueue.add(i);
                topQueue.add(i);
            }
            int[] bottom = new int[4];
            int[] top = new int[4];
            for (int i = 0; i < 4; i++) {
                bottom[i] = bottomQueue.poll();
                top[i] = topQueue.poll();
            }
            int[][] options = new int[][]{{3, 0}, {2, 1}, {1, 2}, {0, 3}};
            int minDiff = Integer.MAX_VALUE;
            for (int[] option : options) {
                minDiff = Math.min(minDiff, top[option[0]] - bottom[option[1]]);
            }
            return minDiff;
        }
    }
}