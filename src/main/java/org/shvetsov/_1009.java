package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1009,
        name = "Complement of Base 10 Integer",
        level = Level.EASY,
        tags = {"Bit Manipulation"}
)
public class _1009 {
    public int bitwiseComplement(int n) {
        int bitLength = Integer.toBinaryString(n).length();
        int mask = (1 << bitLength) - 1;
        return n ^ mask;
    }
}