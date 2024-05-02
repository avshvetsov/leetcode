package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashSet;
import java.util.Set;

@LeetCode(
        number = 2441,
        name = "Largest Positive Integer That Exists With Its Negative",
        level = Level.EASY,
        tags = {"Array, Hash Table, Two Pointers, Sorting"}
)
public class _2441 {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = -1;
        for (int num : nums) {
            int abs = Math.abs(num);
            if (abs > res) {
                set.add(num);
                if (set.contains(-num)) {
                    res = abs;
                }
            }
        }
        return res;
    }
}