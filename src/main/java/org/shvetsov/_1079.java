package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1079,
        name = "Letter Tile Possibilities",
        level = Level.MEDIUM,
        tags = {"Hash Table", "String", "Backtracking", "Counting"}
)
public class _1079 {
    public int numTilePossibilities(String tiles) {
        int[] countingMap = new int[26];
        for (char c : tiles.toCharArray()) {
            countingMap[c - 'A']++;
        }
        return countVariants(countingMap, tiles.length());
    }

    private int countVariants(int[] countingMap, int left) {
        if (left == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < countingMap.length; i++) {
            if (countingMap[i] > 0) {
                countingMap[i]--;
                result += countVariants(countingMap, left - 1);
                countingMap[i]++;
                result++;
            }
        }
        return result;
    }
}