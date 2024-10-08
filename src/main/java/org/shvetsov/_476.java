package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 476,
        name = "Number Complement",
        level = Level.EASY,
        tags = {"Bit Manipulation"}
)
public class _476 {
    public int findComplement(int num) {
        int i = 1;
        while (i <= num && i > 0) {
            i = i << 1;
        }
        return i < 0 ? num ^ Integer.MAX_VALUE : num ^ (i - 1);
    }
}