package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3133,
        name = "Minimum Array End",
        level = Level.MEDIUM,
        tags = {"Bit Manipulation"}
)
public class _3133 {
    public long minEnd(int n, int x) {
        long result = x;
        while (n > 0) {
            result = (result + 1) | x;
            n--;
        }
        return result;
    }
}