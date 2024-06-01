package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3110,
        name = "Score of a String",
        level = Level.EASY,
        tags = {"String"}
)
public class _3110 {
    public int scoreOfString(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        for (int i = 1; i < chars.length; i++) {
            res += Math.abs(chars[i] - chars[i - 1]);
        }
        return res;
    }
}