package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 670,
        name = "Maximum Swap",
        level = Level.MEDIUM,
        tags = {"Math", "Greedy"}
)
public class _670 {
    public int maximumSwap(int num) {
        char[] origin = String.valueOf(num).toCharArray();
        int max = origin[origin.length - 1];
        int maxIndex = origin.length - 1;
        int swapR = -1;
        int swapL = -1;
        for (int i = origin.length - 2; i >= 0; i--) {
            if (origin[i] > max) {
                max = origin[i];
                maxIndex = i;
            } else if (origin[i] < max) {
                swapR = maxIndex;
                swapL = i;
            }
        }
        if (swapL != -1 && swapR != -1) {
            char temp = origin[swapL];
            origin[swapL] = origin[swapR];
            origin[swapR] = temp;
        }
        return Integer.parseInt(String.valueOf(origin));
    }

    public static class NotOptimal {
        public int maximumSwap(int num) {
            char[] origin = String.valueOf(num).toCharArray();
            char[] sorted = String.valueOf(num).toCharArray();
            Arrays.sort(sorted);
            int i = 0;
            while (i < origin.length && origin[i] == sorted[sorted.length - i - 1]) {
                i++;
            }
            if (i == origin.length) return num;

            int j = origin.length - 1;
            while (origin[j] != sorted[sorted.length - i - 1]) {
                j--;
            }
            char temp = origin[i];
            origin[i] = origin[j];
            origin[j] = temp;
            return Integer.parseInt(String.valueOf(origin));
        }
    }
}