package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3403,
        name = "Find the Lexicographically Largest String From the Box I",
        level = Level.MEDIUM,
        tags = {"Two Pointers", "String", "Enumeration"}
)
public class _3403 {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1) {
            return word;
        }
        int maxLength = word.length() - numFriends + 1;
        int l = 0;
        int r = 0;
        int ch = 0;
        for (int i = 0; i < word.length(); i++) {
            int current = word.charAt(i);
            if (current > ch) {
                ch = current;
                l = i;
                r = l;
            } else if (current == ch && r == l) {
                r++;
            } else if (r > l) {
                if (current > word.charAt(r)) {
                    l = i - r + l;
                    r = l;
                } else if (current == word.charAt(r)) {
                    r++;
                } else {
                    r = l;
                }
            }
        }
        return word.substring(l, Math.min(l + maxLength, word.length()));
    }
}