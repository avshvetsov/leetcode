package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1497,
        name = "Check If Array Pairs Are Divisible by k",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Counting"}
)
public class _1497 {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for (int i : arr) {
            int rod = i % k;
            if (rod < 0) {
                freq[Math.abs(rod)]--;
            } else freq[Math.abs(rod)]++;
            // second option count freq
//            int rod = ((i % k) + k) % k;
//            freq[rod]++;
        }
        if (freq[0] % 2 != 0) return false;
        int l = 1;
        int r = freq.length - 1;
        while (l < r) {
            if (freq[l] != freq[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}