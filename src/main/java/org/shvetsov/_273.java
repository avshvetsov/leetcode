package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 273,
        name = "Integer to English Words",
        level = Level.HARD,
        tags = {"Math", "String", "Recursion"}
)
public class _273 {
    static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    static final String[] thousands = {"", "Thousand", "Million", "Billion"};
    static final Integer[] powers = {1, 1000, 1000000, 1000000000};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        StringBuilder sb = new StringBuilder();
        int power = 3;
        while (power >= 0) {
            int div = powers[power];
            int curr = num / div;
            String helper = helper(curr);
            sb.append(" ").append(helper).append(" ");
            if (!helper.isBlank()) {
                sb.append(" ").append(thousands[power]).append(" ");
            }
            num %= div;
            power--;
        }
        return sb.toString().trim().replaceAll(" +", " ");
    }

    private String helper(int curr) {
        StringBuilder sb = new StringBuilder();
        int h = curr / 100;
        if (h > 0) {
            sb.append(" ").append(ones[h]).append(" Hundred ");
        }
        int t = curr % 100 / 10;
        int o = curr % 10;
        if (t > 1) {
            sb.append(" ").append(tens[t]).append(" ").append(ones[o]).append(" ");
        } else if (t == 1) {
            sb.append(" ").append(ones[10 + o]).append(" ");
        } else {
            sb.append(" ").append(ones[o]).append(" ");
        }
        return sb.toString();
    }
}