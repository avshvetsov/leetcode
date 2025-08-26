package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3000,
        name = "Maximum Area of Longest Diagonal Rectangle",
        level = Level.EASY,
        tags = {"Array", "Weekly Contest 379"}
)
public class _3000 {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxD = 0, maxA = 0;
        for (int[] dimension : dimensions) {
            int d = dimension[0] * dimension[0] + dimension[1] * dimension[1];
            if (d > maxD) {
                maxD = d;
                maxA = dimension[0] * dimension[1];
            } else if (d == maxD) {
                maxA = Math.max(maxA, dimension[0] * dimension[1]);
            }
        }
        return maxA;
    }
}