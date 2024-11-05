package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2914,
        name = "Minimum Number of Changes to Make Binary String Beautiful",
        level = Level.MEDIUM,
        tags = {"String"}
)
public class _2914 {
    public int minChanges(String s) {
        int result = 0;
        int prevLength = 0;
        char prevChar = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c == prevChar || prevLength == 0) {
                prevLength++;
            } else {
                if (prevLength % 2 == 0) {
                    prevLength = 1;
                } else {
                    result++;
                    prevLength = 0;
                }
            }
            prevChar = c;
        }
        return result;
    }
}