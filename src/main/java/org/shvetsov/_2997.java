package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2997,
        name = "Minimum Number of Operations to Make Array XOR Equal to K",
        level = Level.MEDIUM,
        tags = {"Array", "Bit Manipulation"}
)
public class _2997 {

    public int minOperations(int[] nums, int k) {
        int[] cnt = new int[20];
        for (int num : nums) {
            for (int i = 0; i < 20; i++) {
                if ((num & (1 << i)) != 0) {
                    cnt[i] += 1;
                }
            }
        }
        int[] kbit = new int[20];
        for (int i = 0; i < 20; i++) {
            if ((k & (1 << i)) != 0) {
                kbit[i] += 1;
            }
        }

        int res = 0;
        boolean b = false;
        for (int i = 19; i >= 0; i--) {
            if (kbit[i] > 0 || cnt[i] > 0) {
                b = true;
            }
            if (b) {
                if (kbit[i] % 2 != cnt[i] % 2) {
                    res++;
                }
            }
        }
        return res;
    }

    public static class BitOperations {
        public int minOperations(int[] nums, int k) {
            int fin = 0;
            for (int num : nums) {
                fin = fin ^ num;
            }

            int res = 0;
            while (fin > 0 || k > 0) {
                if (fin % 2 != k % 2) {
                    res++;
                }
                fin /= 2;
                k /= 2;
            }

            return res;
        }
    }
}