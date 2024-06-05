package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 1002,
        name = "Find Common Characters",
        level = Level.EASY,
        tags = {"Array", "Hash Table", "String"}
)
public class _1002 {
    public List<String> commonChars(String[] words) {
        int[] counts = new int[26];
        for (char c : words[0].toCharArray()) {
            counts[c - 'a']++;
        }
        for (String word : words) {
            int[] curr = new int[26];
            for (char c : word.toCharArray()) {
                curr[c - 'a']++;
            }
            for (int i = 0; i < curr.length; i++) {
                counts[i] = Math.min(curr[i], counts[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (counts[i] > 0) {
                result.add(String.valueOf((char) ('a' + i)));
                counts[i]--;
            }
        }
        return result;
    }
}