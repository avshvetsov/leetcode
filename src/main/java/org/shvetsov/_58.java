package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 58,
        name = "Length of Last Word",
        level = Level.EASY,
        tags = {"String"}
)
public class _58 {
    public int lengthOfLastWord(String s) {
        return s.trim().substring(s.trim().lastIndexOf(" ") + 1).length();
    }

    public int lengthOfLastWord2(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length-1].length();
    }
}