package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 1317,
        name = "Convert Integer to the Sum of Two No-Zero Integers",
        level = Level.EASY,
        tags = {"Math", "Weekly Contest 171"}
)
public class _1317 {
    public int[] getNoZeroIntegers(int n) {
        int[] result = new int[]{1, n - 1};
        while (Arrays.toString(result).contains("0")) {
            result[0]++;
            result[1]--;
        }
        return result;
    }
}