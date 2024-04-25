package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 2370,
        name = "Longest Ideal Subsequence",
        level = Level.MEDIUM,
        tags = {"Hash Table", "String", "Dynamic Programming"}
)
public class _2370 {

    public int longestIdealString(String s, int k) {
        int result = 0;
        int[] dp = new int[26];
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            int curr = ch - 'a';
            for (int i = curr; i >= 0 && i >= curr - k; i--) {
                dp[curr] = Math.max(dp[curr], dp[i] + 1);
            }
            for (int i = curr + 1; i < 26 && i <= curr + k; i++) {
                dp[curr] = Math.max(dp[curr], dp[i] + 1);
            }
            result = Math.max(result, dp[curr]);
        }
        return result;
    }


    public static class TimeLimitExceeded {
        public int longestIdealString(String s, int k) {
            if (s.isEmpty()) return 0;

            Map<Integer, Set<Character>> cache = new HashMap<>();
            cache.computeIfAbsent(-1, i -> new HashSet<>());
            cache.computeIfAbsent(0, i -> new HashSet<>()).add(s.charAt(0));
            int[] lengths = new int[s.length()];
            lengths[0] = 1;


            for (int i = 1; i < s.length(); i++) {
                cache.put(i, new HashSet<>());
                char currChar = s.charAt(i);

                //посчитать текущий lengths[i]
                Set<Character> current = cache.get(i - 1);
                for (Character ch : current) {
                    if (Math.abs(currChar - ch) <= k) {
                        lengths[i] = lengths[i - 1] + 1;
                    }
                }
                if (lengths[i] == 0) {
                    lengths[i] = lengths[i - 1];
                }

                //добавить currChar во все предыдущие и текущий, если подходит
                Set<Character> currentSet = cache.get(i);
                for (int j = i; j >= 0 /*&& j >= i - 100*/; j--) {
                    if (currentSet.contains(currChar)) continue;
                    if (j == 0) {
                        currentSet.add(currChar);
                    }
                    Set<Character> prev = cache.get(j - 1);
                    if (prev == currentSet) continue;
                    for (Character ch : prev) {
                        if (j == 0 || Math.abs(currChar - ch) <= k) {
                            currentSet.add(currChar);
                            break;
                        }
                    }
                    currentSet = prev;
                }
                if (cache.get(i).isEmpty()) {
                    cache.put(i, cache.get(i - 1));
                }
            }
            return lengths[s.length() - 1];
        }
    }


}