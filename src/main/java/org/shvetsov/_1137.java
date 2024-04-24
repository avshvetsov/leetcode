package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 1137,
        name = "N-th Tribonacci Number",
        level = Level.EASY,
        tags = {"Math", "Dynamic Programming", "Memoization"}
)
public class _1137 {

    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int res = 0;
        int a = 0, b = 1, c = 1;
        for (int i = 3; i <= n; i++) {
            res = a + b + c;
            a = b;
            b = c;
            c = res;
        }
        return res;
    }


    public static class MemoRecursion {
        int[] cache = new int[38];
        {
            Arrays.fill(cache, -1);
            cache[0] = 0;
            cache[1] = 1;
            cache[2] = 1;
        }

        public int tribonacci(int n) {
            if (cache[n] != -1) {
                return cache[n];
            }
            if (cache[n - 1] == -1) {
                cache[n - 1] = tribonacci(n - 1);
            }
            if (cache[n - 2] == -1) {
                cache[n - 2] = tribonacci(n - 2);
            }
            if (cache[n - 3] == -1) {
                cache[n - 3] = tribonacci(n - 3);
            }
            return cache[n - 1] + cache[n - 2] + cache[n - 3];
        }
    }

}