package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 7,
        name = "Reverse Integer",
        level = Level.MEDIUM,
        tags = {"Math"}
)
public class _7 {

    public int reverse(int data) {
        String ans = data < 0 ? new StringBuilder(String.valueOf(-data)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(data)).reverse().toString();
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }
}