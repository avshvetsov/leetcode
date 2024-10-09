package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 921,
        name = "Minimum Add to Make Parentheses Valid",
        level = Level.MEDIUM,
        tags = {"String", "Stack", "Greedy"}
)
public class _921 {
    public int minAddToMakeValid(String s) {
        int result = 0, opened = 0;
        for (char c : s.toCharArray()) {
            if(c == '(') opened++;
            else if (c == ')') {
                if(opened > 0) opened--;
                else result++;
            }
        }
        return result + opened;
    }
}