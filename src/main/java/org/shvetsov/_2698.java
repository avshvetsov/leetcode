package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 2698,
        name = "Find the Punishment Number of an Integer",
        level = Level.MEDIUM,
        tags = {"Math", "Backtracking"}
)
public class _2698 {

    static Map<Integer, Boolean> cache = new HashMap<>();

    public int punishmentNumber(int n) {
        int res = 0;
        while (n > 0) {
            int square = n * n;
            if (cache.containsKey(n)) {
                if (cache.get(n)) {
                    res += square;
                }
            } else {
                boolean punishment = isPunishment(String.valueOf(square), 0, n);
                cache.put(n, punishment);
                if (punishment) {
                    res += square;
                }
            }
            n--;
        }
        return res;
    }

    private boolean isPunishment(String s, int acc, int target) {
        if (s.isEmpty() && acc == target) {
            return true;
        }
        if (acc > target) {
            return false;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (isPunishment(s.substring(i), acc + Integer.parseInt(s.substring(0, i)), target)) {
                return true;
            }
        }
        return false;
    }
}