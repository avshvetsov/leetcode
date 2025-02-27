package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@LeetCode(
        number = 873,
        name = "Length of Longest Fibonacci Subsequence",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Dynamic Programming"}
)
public class _873 {
    public int lenLongestFibSubseq(int[] arr) {
        int result = 0;
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int prev = arr[i];
                int curr = arr[j];
                int next = curr + prev;
                int length = 2;
                while (set.contains(next)) {
                    prev = curr;
                    curr = next;
                    next = curr + prev;
                    length++;
                }
                result = Math.max(result, length);
            }
        }
        return result > 2 ? result : 0;
    }
}