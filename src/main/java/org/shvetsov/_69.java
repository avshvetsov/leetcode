package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 69,
        name = "Sqrt(x)",
        level = Level.EASY,
        tags = {"Math", "Binary Search"}
)
public class _69 {

    public int mySqrt(int x) {
        if (x <= 1) return x;
        int lower = 0;
        int upper = x;
        int curr = lower + (upper - lower) / 2;
        while (upper - lower != 1) {
            long i = (long) curr * curr;
            if (i > (long)x) {
                upper = curr;
            } else {
                lower = curr;
            }
            curr = lower + (upper - lower) / 2;
        }
        return lower;
    }
}
