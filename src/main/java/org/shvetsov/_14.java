package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 14,
        name = "Longest Common Prefix",
        level = Level.EASY,
        tags = {"String", "Trie"}
)
public class _14 {
    public String longestCommonPrefix(String[] strs) {
        String smallest = Arrays.stream(strs)
                .reduce((s, s2) -> s.length() < s2.length() ? s : s2)
                .orElse("");
        StringBuilder res = new StringBuilder();
        boolean isEqual = true;
        for (int i = 0; i < smallest.toCharArray().length && isEqual; i++) {
            char c = smallest.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) res.append(c);
        }
        return res.toString();
    }
}