package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@LeetCode(
        number = 826,
        name = "Most Profit Assigning Work",
        level = Level.MEDIUM,
        tags = {"Array", "Two Pointers", "Binary Search", "Greedy", "Sorting"}
)
public class _826 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int result = 0;
        NavigableMap<Integer, Integer> mapDiffProf = new TreeMap<>();
        mapDiffProf.put(0, 0);
        for (int i = 0; i < difficulty.length; i++) {
            int diff = difficulty[i];
            int prof = profit[i];
            if (mapDiffProf.floorEntry(diff).getValue() < prof) {
                mapDiffProf.put(diff, prof);
                Map.Entry<Integer, Integer> higherEntry = mapDiffProf.higherEntry(diff);
                while (higherEntry != null && higherEntry.getValue() < prof) {
                    diff = higherEntry.getKey();
                    mapDiffProf.remove(diff);
                    higherEntry = mapDiffProf.higherEntry(diff);
                }
            }
        }
        for (int w : worker) {
            result += mapDiffProf.floorEntry(w).getValue();
        }
        return result;
    }

    public static class Memorization {
        public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
            int result = 0;
            int maxW = Arrays.stream(worker).max().getAsInt();
            int[] dp = new int[maxW + 1];
            for (int i = 0; i < difficulty.length; i++) {
                if (difficulty[i] <= maxW && profit[i] > dp[difficulty[i]]) {
                    dp[difficulty[i]] = profit[i];
                }
            }
            for (int i = 1; i <= maxW; i++) {
                dp[i] = Math.max(dp[i], dp[i - 1]);
            }
            for (int w : worker) {
                result += dp[w];
            }
            return result;
        }
    }
}