package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 9,
        name = "Palindrome Number",
        level = Level.EASY,
        tags = {"Math"}
)
public class _9 {

    public boolean isPalindrome(int x) {
        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }
}