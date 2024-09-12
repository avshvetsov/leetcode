package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashSet;
import java.util.Set;

@LeetCode(
        number = 1684,
        name = "Count the Number of Consistent Strings",
        level = Level.EASY,
        tags = {"Array", "Hash Table", "String", "Bit Manipulation", "Counting"}
)
public class _1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        int res = 0;
        for (String word : words) {
            boolean onlyAllowed = true;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    onlyAllowed = false;
                    break;
                }
            }
            if (onlyAllowed) res++;
        }
        return res;
    }
}