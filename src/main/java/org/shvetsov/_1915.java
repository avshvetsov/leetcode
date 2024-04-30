package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 1915,
        name = "Number of Wonderful Substrings",
        level = Level.MEDIUM,
        tags = {"Hash Table", "String", "Bit Manipulation", "Prefix Sum"}
)
public class _1915 {

    public long wonderfulSubstrings(String word) {
        int[] counts = new int[1024];
        counts[0] = 1;
        long res = 0;
        for (char ch : word.toCharArray()) {
            int[] newCounts = new int[1024];
            newCounts[0] = 1;
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] != 0) {
                    int curr = i ^ 1 << (ch - 'a');
                    if (curr == 0 || (curr & (curr - 1)) == 0) {
                        res += counts[i];
                    }
                    newCounts[curr] += counts[i];
                }
            }
            counts = newCounts;
        }
        return res;
    }



    public long wonderfulSubstrings2(String word) {
        Map<Integer, Integer> counts = new HashMap<>();
        long res = 0;
        counts.put(0, 1);
        char[] chars = word.toCharArray();
        for (char ch : chars) {
            Map<Integer, Integer> newCounts = new HashMap<>();
            newCounts.put(0, 1);
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                int curr = entry.getKey() ^ 1 << (ch - 'a');
                if (curr == 0 || (curr & (curr - 1)) == 0) {
                    res += entry.getValue();
                }
                newCounts.put(curr, newCounts.getOrDefault(curr, 0) + entry.getValue());
            }
            counts = newCounts;
        }
        return res;
    }

    public long wonderfulSubstrings1(String word) {
        long res = 0;
        char[] chars = word.toCharArray();
        for (int l = 0; l < word.length(); l++) {
            int curr = 0;
            for (int r = l; r < word.length(); r++) {
                curr ^= (1 << (chars[r] - 'a'));
                if (curr == 0 || (curr & (curr - 1)) == 0) {
                    res++;
                }
            }
        }
        return res;
    }

}