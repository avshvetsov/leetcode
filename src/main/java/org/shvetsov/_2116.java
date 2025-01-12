package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2116,
        name = "Check if a Parentheses String Can Be Valid",
        level = Level.MEDIUM,
        tags = {"String", "Stack", "Greedy"}
)
public class _2116 {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) return false;

        int openMax = 0, closeMin = 0;
        int opened = 0;
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == '(') {
                    openMax++;
                    opened++;
                } else if (s.charAt(i) == ')') {
                    closeMin++;
                    opened = Math.max(0, opened - 1);
                }
                if (openMax < closeMin)
                    return false;
            } else {
                openMax++;
                opened = Math.max(0, opened - 1);
            }
        }
        return opened == 0;
    }

}