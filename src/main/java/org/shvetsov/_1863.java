package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1863,
        name = "Sum of All Subset XOR Totals",
        level = Level.EASY,
        tags = {"Array", "Math", "Backtracking", "Bit Manipulation", "Combinatorics", "Enumeration"}
)
public class _1863 {

    public int subsetXORSum(int[] nums) {
        return subsetHelper(nums, 0, nums.length, 0);
    }

    private int subsetHelper(int[] nums, int xor, int size, int f) {
        if (size == 0) return 0;
        int res = 0;
        for (int i = f; i < nums.length; i++) {
            int newXor = xor ^ nums[i];
            res += newXor;
            res += subsetHelper(nums, newXor, size - 1, i + 1);
        }
        return res;
    }
}