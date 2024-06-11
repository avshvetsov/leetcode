package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 1122,
        name = "Relative Sort Array",
        level = Level.EASY,
        tags = {"Array", "Hash Table", "Sorting", "Counting Sort"}
)
public class _1122 {
    private static final int MIN = 1;
    private static final int MAX = 1000;

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[MAX + 1];
        for (int i : arr1) {
            freq[i]++;
        }
        int j = 0;
        for (int i : arr2) {
            int end = j + freq[i];
            freq[i] = 0;
            Arrays.fill(arr1, j, end, i);
            j = end;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                int end = j + freq[i];
                Arrays.fill(arr1, j, end, i);
                j = end;
            }
        }
        return arr1;
    }
}