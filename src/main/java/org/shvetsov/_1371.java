package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 1371,
        name = "Find the Longest Substring Containing Vowels in Even Counts",
        level = Level.MEDIUM,
        tags = {"Hash Table", "String", "Bit Manipulation", "Prefix Sum"}
)
public class _1371 {
    private static final Map<Character, Integer> map = new HashMap<>(){{
        put('a', 1);
        put('e', 2);
        put('i', 4);
        put('o', 8);
        put('u', 16);
    }};
    public int findTheLongestSubstring(String s) {
        int[] prefix = new int[s.length() + 1];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            prefix[i + 1] = prefix[i] ^ map.getOrDefault(chars[i], 0);
        }
        int[][] dist = new int[2][32];
        Arrays.fill(dist[0], -1);
        Arrays.fill(dist[1], -1);
        for (int i = 0; i < prefix.length; i++) {
            if (dist[0][prefix[i]] == -1) {
                dist[0][prefix[i]] = i;
            } else dist[1][prefix[i]] = i;
        }
        int max = 0;
        for (int i = 0; i < dist[0].length; i++) {
            max = Math.max(max, dist[1][i] - dist[0][i]);
        }
        return max;
    }
}