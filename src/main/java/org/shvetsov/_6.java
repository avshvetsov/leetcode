package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 6,
        name = "Zigzag Conversion",
        level = Level.MEDIUM,
        tags = {"String"}
)
public class _6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder res = new StringBuilder();
        int length = s.length();
        int symbolsInLoop = numRows * 2 - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < length; j += symbolsInLoop) {
                res.append(s.charAt(i + j));
                if (i != 0 && i != numRows - 1 && j + 2 * numRows - i - 2 < length) {
                    res.append(s.charAt(j + 2 * numRows - i - 2));
                }
            }
        }
        return res.toString();
    }
}