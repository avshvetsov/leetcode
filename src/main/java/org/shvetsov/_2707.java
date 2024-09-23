package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 2707,
        name = "Extra Characters in a String",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "String", "Dynamic Programming", "Trie"}
)
public class _2707 {
    private final Map<String, Integer> dp = new HashMap<>();
    public int minExtraChar(String s, String[] dictionary) {
        if (s.isEmpty()) return 0;
        if (dp.containsKey(s)) return dp.get(s);
        int result = minExtraChar(s.substring(1), dictionary) + 1;
        for (String entry : dictionary) {
            if (s.startsWith(entry)) {
                result = Math.min(result, minExtraChar(s.substring(entry.length()), dictionary));
            }
        }
        dp.put(s, result);
        return result;
    }
}