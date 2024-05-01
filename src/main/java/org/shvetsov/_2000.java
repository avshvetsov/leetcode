package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2000,
        name = "Reverse Prefix of Word",
        level = Level.EASY,
        tags = {"Two Pointers", "String"}
)
public class _2000 {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuilder sb = new StringBuilder();
        for (int i = index; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        sb.append(word.substring(index + 1));
        return sb.toString();
    }

    public String reversePrefix1(String word, char ch) {
        return new StringBuilder(word.substring(0, word.indexOf(ch) + 1)).reverse() + word.substring(word.indexOf(ch) + 1);
    }
}