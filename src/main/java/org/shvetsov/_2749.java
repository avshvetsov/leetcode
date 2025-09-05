package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2749,
        name = "Minimum Operations to Make the Integer Zero",
        level = Level.MEDIUM,
        tags = {"Bit Manipulation", "Brainteaser", "Enumeration", "Weekly Contest 351"}
)
public class _2749 {
    public int makeTheIntegerZero(int num1, int num2) {
        long num = num1;
        for (int i = 0; i <= 32; i++) {
            int bitCount = Long.bitCount(num);
//            String binaryString = Long.toBinaryString(num);
            if (bitCount <= i && num >= i) {
                return i;
            }
            if (num < 0 && num2 >= 0) {
                return -1;
            }
            num -= num2;
        }
        return -1;
    }
}