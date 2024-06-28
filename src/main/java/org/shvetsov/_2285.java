package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 2285,
        name = "Maximum Total Importance of Roads",
        level = Level.MEDIUM,
        tags = {"Greedy", "Graph", "Sorting", "Heap (Priority Queue)"}
)
public class _2285 {
    public long maximumImportance(int n, int[][] roads) {
        int[] cnts = new int[n];
        for (int[] road : roads) {
            for (int city : road) {
                cnts[city]++;
            }
        }
        long res = 0;
        Arrays.sort(cnts);
        while (n > 0 && cnts[n - 1] > 0) {
            res += (long) cnts[n - 1] * n;
            n--;
        }
        return res;
    }
}