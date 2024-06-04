package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 409,
        name = "Longest Palindrome",
        level = Level.EASY,
        tags = {"Hash Table", "String", "Greedy"}
)
public class _409 {
    public int longestPalindrome(String s) {
        int[] dp = new int[58];
        for (char c : s.toCharArray()) {
            dp[c - 'A']++;
        }
        int res = 0;
        boolean b = false;
        for (int i : dp) {
            if (i % 2 == 0) {
                res += i;
            } else {
                res += i - 1;
                b = true;
            }
        }
        if (b) res++;
        return res;
    }
}