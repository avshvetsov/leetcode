package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1652,
        name = "Defuse the Bomb",
        level = Level.EASY,
        tags = {"Array", "Sliding Window"}
)
public class _1652 {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) return result;
        for (int i = 0; i < code.length; i++) {
            int sum = 0;
            for (int j = Math.abs(k); j > 0; j--) {
                int current = k > 0 ? code[(i + j + n) % n] : code[(i - j + n) % n];
                sum += current;
            }
            result[i] = sum;
        }
        return result;
    }


    public static class SlidingWindow {
        public int[] decrypt(int[] code, int k) {
            int n = code.length;
            int[] result = new int[n];
            if (k == 0) return result;
            int start, end, sum = 0;
            if (k > 0) {
                start = 1;
                end = k;
            }
            else {
                start = n - Math.abs(k);
                end = n - 1;
            }
            for (int i = start; i <= end; i++) sum += code[i];

            for (int i = 0; i < n; i++) {
                result[i] = sum;
                sum -= code[(start) % n];
                end++;
                sum += code[(end) % n];
                start++;
            }
            return result;
        }
    }
}