package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@LeetCode(
        number = 78,
        name = "Subsets",
        level = Level.MEDIUM,
        tags = {"Array", "Backtracking", "Bit Manipulation"}
)
public class _78 {
    public List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        result.add(List.of());
        subsetHelper(nums, 0, new LinkedList<>());
        return result;
    }

    private void subsetHelper(int[] nums, int l, List<Integer> acc) {
        for (int i = l; i < nums.length; i++) {
            List<Integer> subset = new LinkedList<>(acc);
            subset.add(nums[i]);
            result.add(subset);
            subsetHelper(nums, i + 1, subset);
        }
    }

    public static class BitManipulation {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            int n = nums.length;
            for (int i = 0; i < (1 << n); i++) {
                List<Integer> subset = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) > 0) {
                        subset.add(nums[j]);
                    }
                }
                result.add(subset);
            }
            return result;
        }
    }
}