package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 564,
        name = "Find the Closest Palindrome",
        level = Level.HARD,
        tags = {"Math", "String"}
)
public class _564 {
    public String nearestPalindromic(String n) {
        if (n.length() == 1) {
            return n.equals("0") ? "1" : String.valueOf(Integer.parseInt(n) - 1);
        }
        String result = String.valueOf(Long.MAX_VALUE);
        long current = Long.parseLong(n);
        long minAbs = Long.MAX_VALUE;
        for (PalindromeOptions option : PalindromeOptions.values()) {
            String palindromeString = option.getPalindrome(n);
            if (!palindromeString.equals(n)) {
                long palindrome = Long.parseLong(palindromeString);
                long abs = Math.abs(current - palindrome);
                if (abs < minAbs) {
                    minAbs = abs;
                    result = palindromeString;
                } else if (abs == minAbs) {
                    result = String.valueOf(Math.min(palindrome, Long.parseLong(result)));
                }
            }
        }
        return result;
    }

    private enum PalindromeOptions {
        CURRENT{
            @Override
            public String getPalindrome(String n) {
                String half = n.substring(0, n.length() / 2);
                if (n.length() % 2 == 0) {
                    return half + new StringBuilder(half).reverse();
                } else {
                    return half + n.charAt(n.length()/2) + new StringBuilder(half).reverse();
                }
            }
        },
        DECREMENTED{
            @Override
            public String getPalindrome(String n) {
                String half = n.substring(0, n.length() / 2);
                if (n.length() % 2 == 0) {
                    String dec = String.valueOf(Long.parseLong(half) - 1);
                    return dec + new StringBuilder(dec).reverse();
                } else {
                    if (n.charAt(n.length() / 2) == '0') {
                        return n;
                    }
                    return half + (Character.getNumericValue(n.charAt(n.length()/2)) - 1) + new StringBuilder(half).reverse();
                }
            }
        },
        INCREMENTED{
            @Override
            public String getPalindrome(String n) {
                String half = n.substring(0, n.length() / 2);
                if (n.length() % 2 == 0) {
                    String dec = String.valueOf(Long.parseLong(half) + 1);
                    return dec + new StringBuilder(dec).reverse();
                } else {
                    return half + (Character.getNumericValue(n.charAt(n.length()/2)) + 1) + new StringBuilder(half).reverse();
                }
            }
        },
        LOWER_RANK{
            @Override
            public String getPalindrome(String n) {
                return "9".repeat(Math.max(0, n.length() - 1));
            }
        },
        UPPER_RANK{
            @Override
            public String getPalindrome(String n) {
                return "1" + "0".repeat(Math.max(0, n.length() - 1)) + "1";
            }
        };

        public abstract String getPalindrome(String n);
    }
}