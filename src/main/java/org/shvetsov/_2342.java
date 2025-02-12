package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 2342,
        name = "Max Sum of a Pair With Equal Sum of Digits",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Sorting", "Heap (Priority Queue)"}
)
public class _2342 {
    public int maximumSum(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> digitSumMap = new HashMap<>();
        for (int num : nums) {
            int sum = 0;
            for (char c : String.valueOf(num).toCharArray()) {
                sum += c - '0';
            }
            digitSumMap.computeIfAbsent(sum, k -> new PriorityQueue<>(Comparator.reverseOrder())).add(num);
        }
        return digitSumMap.values().stream()
                .filter(set -> set.size() > 1)
                .mapToInt(set -> set.poll() + set.poll())
                .max()
                .orElse(-1);
    }
}