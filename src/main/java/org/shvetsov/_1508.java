package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

@LeetCode(
        number = 1508,
        name = "Range Sum of Sorted Subarray Sums",
        level = Level.MEDIUM,
        tags = {"Array", "Two Pointers", "Binary Search", "Sorting"}
)
public class _1508 {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] sums = new int[n * (n + 1) / 2];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sums[k] = i != j ? sums[k - 1] + nums[j] : nums[j];
                k++;
            }
        }
        Arrays.sort(sums);
        int res = 0;
        for (int i = left - 1; i < right; i++) {
            res = (int) ((res + sums[i]) % (1e9 + 7));
        }
        return res;
    }

    public static class WithPQ {
        public int rangeSum(int[] nums, int n, int left, int right) {
            int res = 0;
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(value -> value[0]));
            for (int i = 0; i < nums.length; i++) {
                pq.offer(new int[]{nums[i], i});
            }
            int k = 0;
            while (k < right && !pq.isEmpty()) {
                int[] curr = pq.poll();
                if (k >= left - 1) {
                    res = (int) ((res + curr[0]) % (1e9 + 7));
                }
                if (curr[1] + 1 < n) {
                    pq.offer(new int[]{curr[0] + nums[curr[1] + 1], curr[1] + 1});
                }
                k++;
            }
            return res;
        }
    }
}