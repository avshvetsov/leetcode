package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.NavigableMap;

@LeetCode(
        number = 633,
        name = "Sum of Square Numbers",
        level = Level.MEDIUM,
        tags = {"Math", "Two Pointers", "Binary Search"}
)
public class _633 {
    public boolean judgeSquareSum(int c) {
        int max = (int) Math.sqrt(c);
        long[] square = new long[max + 1];
        for (int i = 0; i <= max; i++) {
            square[i] = i * i;
        }
        int l = 0, r = max;
        while (l <= r) {
            long sum = square[l] + square[r];
            if (sum == c) {
                return true;
            } else if (sum > c) {
                r--;
            } else {
                l++;
            }
        }
        return false;
    }
}