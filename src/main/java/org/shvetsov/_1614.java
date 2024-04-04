package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1614,
        name = "Maximum Nesting Depth of the Parentheses",
        level = Level.EASY,
        tags = {"String", "Stack"}
)
public class _1614 {
    public int maxDepth(String s) {
        int res = 0;
        int depth = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                depth++;
                res = Math.max(res, depth);
            }
            if (chars[i] == ')') {
                depth--;
            }
        }
        return res;
    }
}