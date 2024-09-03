package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1945,
        name = "Sum of Digits of String After Convert",
        level = Level.EASY,
        tags = {"String", "Simulation"}
)
public class _1945 {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1);
        }
        String res = sb.toString();
        for (int i = k; i > 0; i--) {
            res = sumOfDigits(res);
        }
        return Integer.parseInt(res);
    }

    private String sumOfDigits(String s) {
        int res = 0;
        for (char c : s.toCharArray()) {
            res += Character.getNumericValue(c);
        }
        return String.valueOf(res);
    }
}