package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2490,
        name = "Circular Sentence",
        level = Level.EASY,
        tags = {"String"}
)
public class _2490 {
    public boolean isCircularSentence(String sentence) {
        char prev = sentence.charAt(sentence.length() - 1);
        for (String s : sentence.split(" ")) {
            if (prev != s.charAt(0)) return false;
            prev = s.charAt(s.length() - 1);
        }
        return true;
    }
}