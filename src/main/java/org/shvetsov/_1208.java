package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1208,
        name = "Get Equal Substrings Within Budget",
        level = Level.MEDIUM,
        tags = {"String", "Binary Search", "Sliding Window", "Prefix Sum"}
)
public class _1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int l = 0, r = 0;
        int result = 0;
        int sum = 0;
        while (r < t.length()) {
            sum += Math.abs(s.charAt(r) - t.charAt(r));
            while (sum > maxCost) {
                sum -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
            r++;
            result = Math.max(result, r - l);
        }
        return result;
    }
}