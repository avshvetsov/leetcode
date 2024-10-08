package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1963,
        name = "Minimum Number of Swaps to Make the String Balanced",
        level = Level.MEDIUM,
        tags = {"Two Pointers", "String", "Stack", "Greedy"}
)
public class _1963 {
    public int minSwaps(String s) {
        int result = 0;
        int opened = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                opened++;
            } else {
                if (opened == 0) {
                    result++;
                    opened++;
                } else opened--;
            }
        }
        return result;
    }
}