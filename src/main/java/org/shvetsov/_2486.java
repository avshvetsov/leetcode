package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2486,
        name = "Append Characters to String to Make Subsequence",
        level = Level.MEDIUM,
        tags = {"Two Pointers", "String", "Greedy"}
)
public class _2486 {
    public int appendCharacters(String s, String t) {
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        int j = 0;
        for (int i = 0; i < sch.length && j < t.length(); i++) {
            if (sch[i] == tch[j]) {
                j++;
            }
        }
        return t.length() - j;
    }
}