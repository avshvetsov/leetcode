package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 1790,
        name = "Check if One String Swap Can Make Strings Equal",
        level = Level.EASY,
        tags = {"Hash Table", "String", "Counting"}
)
public class _1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] diffChars = new char[2];
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
                if (diff == 1) {
                    diffChars[0] = s1.charAt(i);
                    diffChars[1] = s2.charAt(i);
                } else if (diff == 2 && (diffChars[0] != s2.charAt(i) || diffChars[1] != s1.charAt(i))) {
                    return false;
                }
            }
            if (diff > 2) {
                return false;
            }
        }
        return diff == 0 || diff == 2;
    }

    public boolean areAlmostEqualCounting(String s1, String s2) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
            c1[s1.charAt(i) - 'a']++;
            c2[s2.charAt(i) - 'a']++;
            if (diff > 2) {
                return false;
            } else if (diff == 2 && !Arrays.equals(c1, c2)) {
                return false;
            }
        }
        return Arrays.equals(c1, c2);
    }
}