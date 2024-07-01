package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1550,
        name = "Three Consecutive Odds",
        level = Level.EASY,
        tags = {"Array"}
)
public class _1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int consecutiveOdds = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                consecutiveOdds++;
                if (consecutiveOdds >= 3) {
                    return true;
                }
            } else consecutiveOdds = 0;
        }
        return false;
    }
}