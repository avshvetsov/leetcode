package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2220,
        name = "Minimum Bit Flips to Convert Number",
        level = Level.EASY,
        tags = {"Bit Manipulation"}
)
public class _2220 {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int result = 0;
        while (xor != 0) {
            result += xor & 1;
            xor = xor >> 1;
        }
        return result;
    }

    public static class BrianKernighan {
        public int minBitFlips(int start, int goal) {
            int xor = start ^ goal;
            int result = 0;
            while (xor != 0) {
                xor &= xor - 1;
                result++;
            }
            return result;
        }
    }
}