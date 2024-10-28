package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2501,
        name = "Longest Square Streak in an Array",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Binary Search", "Dynamic Programming", "Sorting"}
)
public class _2501 {
    public int longestSquareStreak(int[] nums) {
        boolean[] numsTransformed = new boolean[100001];
        for (int num : nums) {
            numsTransformed[num] = true;
        }
        int MAX_POSSIBLE_SQUARE = (int) Math.ceil(Math.sqrt(100000));
        int streak = -1;
        for (int i = 0; i < MAX_POSSIBLE_SQUARE; i++) {
            int currentStreak = 0;
            int j = i;
            while (numsTransformed[j]) {
                numsTransformed[j] = false;
                currentStreak++;
                if (j < MAX_POSSIBLE_SQUARE) {
                    j *= j;
                } else break;
            }
            if (currentStreak > 1) streak = Math.max(streak, currentStreak);
        }
        return streak;
    }
}