package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1460,
        name = "Make Two Arrays Equal by Reversing Subarrays",
        level = Level.EASY,
        tags = {"Array", "Hash Table", "Sorting"}
)
public class _1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        //reversing subarray we can achive sorting arr witch order you want
        int[] freq = new int[1001];
        for (int i : arr) {
            freq[i]++;
        }
        for (int i : target) {
            freq[i]--;
        }
        for (int i : freq) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}