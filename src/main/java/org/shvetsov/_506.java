package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 506,
        name = "Relative Ranks",
        level = Level.EASY,
        tags = {"Array", "Sorting", "Heap (Priority Queue)"}
)
public class _506 {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ranks = new String[n];
        Map<Integer, String> map = new HashMap<>();
        int[] sorted = Arrays.copyOf(score, n);
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            int pos = n - i;
            switch (pos) {
                case 1 -> map.put(sorted[i], "Gold Medal");
                case 2 -> map.put(sorted[i], "Silver Medal");
                case 3 -> map.put(sorted[i], "Bronze Medal");
                default -> map.put(sorted[i], Integer.toString(pos));
            }
        }
        for (int i = 0; i < n; i++) {
            ranks[i] = map.get(score[i]);
        }
        return ranks;
    }

    public String[] findRelativeRanksStream(int[] score) {
        int n = score.length;
        String[] ranks = new String[n];
        Map<Integer, String> map = new HashMap<>();
        List<Integer> sorted = Arrays.stream(score).sorted().boxed().toList();
        for (int i = 0; i < n; i++) {
            switch (n - i) {
                case 1 -> map.put(sorted.get(i), "Gold Medal");
                case 2 -> map.put(sorted.get(i), "Silver Medal");
                case 3 -> map.put(sorted.get(i), "Bronze Medal");
                default -> map.put(sorted.get(i), Integer.toString(n - i));
            }
        }
        for (int i = 0; i < n; i++) {
            ranks[i] = map.get(score[i]);
        }
        return ranks;
    }

    public static class SolutionWithLoops {
        public String[] findRelativeRanks(int[] score) {
            int n = score.length;
            String[] ranks = new String[n];
            int[] positions = new int[n];
            for (int i = 0; i < score.length; i++) {
                int value = score[i];
                int pos = 1;
                for (int j = 0; j <= i; j++) {
                    if (i == j) {
                        positions[j] = pos;
                    } else if (value > score[j]) {
                        positions[j]++;
                    } else pos++;
                }
            }

            for (int i = 0; i < n; i++) {
                switch (positions[i]) {
                    case 1 -> ranks[i] = "Gold Medal";
                    case 2 -> ranks[i] = "Silver Medal";
                    case 3 -> ranks[i] = "Bronze Medal";
                    default -> ranks[i] = String.valueOf(positions[i]);
                }
            }
            return ranks;
        }
    }
}