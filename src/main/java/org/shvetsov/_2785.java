package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 2785,
        name = "Sort Vowels in a String",
        level = Level.MEDIUM,
        tags = {"String", "Sorting", "Biweekly Contest 109"}
)
public class _2785 {
    public String sortVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Character> vowelsInS = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (vowels.contains(chars[i])) {
                vowelsInS.add(chars[i]);
                chars[i] = 0;
            }
        }
        vowelsInS.sort(Character::compareTo);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 0) {
                chars[i] = vowelsInS.removeFirst();
            }
        }
        return String.valueOf(chars);
    }
}