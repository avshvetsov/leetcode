package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 719,
        name = "Find K-th Smallest Pair Distance",
        level = Level.HARD,
        tags = {"Array", "Two Pointers", "Binary Search", "Sorting"}
)
public class _719 {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int minDist = 0;
        int maxDist = nums[nums.length - 1] - nums[0];
        while (maxDist > minDist) {
            int mid = (maxDist + minDist) / 2;
            int cnt = countUntilDist(nums, mid);
            if (cnt < k) {
                minDist = mid + 1;
            } else {
                maxDist = mid;
            }
        }
        return minDist;
    }

    private int countUntilDist(int[] nums, int dist) {
        int res = 0;
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            while (nums[r] - nums[l] > dist) {
                l++;
            }
            res += r - l;
        }
        return res;
    }

    public static class BruteForce {
        public int smallestDistancePair(int[] nums, int k) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            int[] dist = new int[max - min + 1];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    dist[Math.abs(nums[i] - nums[j])]++;
                }
            }
            int currDist = 0;
            while (k > 0) {
                k -= dist[currDist];
                currDist++;
            }
            return currDist - 1;
        }
    }
}