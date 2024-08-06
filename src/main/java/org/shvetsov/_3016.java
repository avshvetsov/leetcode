package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.SortedMap;

@LeetCode(
        number = 3016,
        name = "Minimum Number of Pushes to Type Word II",
        level = Level.MEDIUM,
        tags = {"Hash Table", "String", "Greedy", "Sorting", "Counting"}
)
public class _3016 {
    public int minimumPushes(String word) {
        int[] counts = new int[26];
        for (char c : word.toCharArray()) {
            counts[c - 'a']++;
        }
        Arrays.sort(counts);
        int res = 0;
        int touches = 0;
        int i = 0;
        while (i < 26 && counts[25 - i] > 0) {
            if (i % 8 == 0) {
                touches++;
            }
            res += counts[25 - i] * touches;
            i++;
        }
        return res;
    }
}