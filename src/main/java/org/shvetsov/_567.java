package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 567,
        name = "Permutation in String",
        level = Level.MEDIUM,
        tags = {"Hash Table", "Two Pointers", "String", "Sliding Window"}
)
public class _567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count = new int[26];
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int l = 0, r = 0;
        while (r < s2.length()) {
            int lc = s2.charAt(l) - 'a';
            int rc = s2.charAt(r) - 'a';
            if (r < s1.length()) {
                count[rc]--;
                r++;
            } else {
                count[lc]++;
                count[rc]--;
                l++;
                r++;
            }
            if (containsOnlyZeros(count)) return true;
        }
        return false;
    }

    private boolean containsOnlyZeros(int[] count) {
        for (int i : count) {
            if (i != 0) return false;
        }
        return true;
    }
}