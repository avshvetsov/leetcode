package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1304,
        name = "Find N Unique Integers Sum up to Zero",
        level = Level.EASY,
        tags = {"Array", "Math", "Weekly Contest 169"}
)
public class _1304 {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        if (n % 2 != 0) {
            result[n - 1] = 0;
        }
        for (int i = 1; i < n; i += 2) {
            result[i - 1] = i / 2 + 1;
            result[i] = -(i / 2 + 1);
        }
        return result;
    }
}