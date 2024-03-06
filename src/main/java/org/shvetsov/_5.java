package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 5,
        name = "Longest Palindromic Substring",
        level = Level.MEDIUM,
        tags = {"String", "Dynamic Programming"}
)
public class _5 {

    public String longestPalindrome(String s) {
        String result = s.length() > 0 ? String.valueOf(s.charAt(0)) : "";
        for (int i = 0; i < s.length() - 1; i++) {
            boolean ch = true;
            boolean nech = true;
            for (int j = 1; j <= s.length() / 2; j++) {
                //нечетные
                if (i - j >= 0 && i + j < s.length() && nech) {
                    if (s.charAt(i - j) == s.charAt(i + j)) {
                        if (j * 2 + 1 > result.length()) {
                            result = s.substring(i - j, i + j + 1);
                        }
                    } else nech = false;
                }
                //четные
                if (s.charAt(i) == s.charAt(i + 1)) {
                    if (2 > result.length()) {
                        result = s.substring(i, i + 2);
                    }
                    if (i - j >= 0 && i + 1 + j < s.length() && ch) {
                        if (s.charAt(i - j) == s.charAt(i + 1 + j)) {
                            if (j * 2 + 2 > result.length()) {
                                result = s.substring(i - j, i + 1 + j + 1);
                            }
                        } else ch = false;
                    }
                }
            }
        }
        return result;
    }

}