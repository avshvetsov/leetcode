package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 3160,
        name = "Find the Number of Distinct Colors Among the Balls",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Simulation"}
)
public class _3160 {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballColor = new HashMap<>();
        Map<Integer, Set<Integer>> colorBalls = new HashMap<>();
        int[] result = new int[queries.length];
        int colorsCount = 0;
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int ball = query[0];
            int color = query[1];
            Integer prevColor = ballColor.getOrDefault(ball, 0);

            if (colorBalls.containsKey(prevColor)) {
                Set<Integer> ballsWithPrevColor = colorBalls.get(prevColor);
                ballsWithPrevColor.remove(ball);
                if (ballsWithPrevColor.isEmpty()) {
                    colorsCount--;
                }
            }
            if (colorBalls.getOrDefault(color, Collections.emptySet()).isEmpty()) {
                colorsCount++;
            }

            colorBalls.computeIfAbsent(color, k -> new HashSet<>()).add(ball);
            ballColor.put(ball, color);
            result[i] = colorsCount;
        }
        return result;
    }


    public int[] queryResultsOptimized(int limit, int[][] queries) {
        Map<Integer, Integer> ballColor = new HashMap<>();
        Map<Integer, Integer> colorBalls = new HashMap<>();
        int[] result = new int[queries.length];
        int colorsCount = 0;
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int ball = query[0];
            int color = query[1];
            Integer prevColor = ballColor.getOrDefault(ball, 0);
            Integer ballsWithPrevColor = colorBalls.getOrDefault(prevColor, 0);
            if (ballsWithPrevColor > 0) {
                colorBalls.put(prevColor, ballsWithPrevColor - 1);
                if (ballsWithPrevColor == 1) {
                    colorsCount--;
                }
            }
            Integer ballsWithCurrColor = colorBalls.getOrDefault(color, 0);
            if (ballsWithCurrColor == 0) {
                colorsCount++;
            }
            colorBalls.put(color, ballsWithCurrColor + 1);
            ballColor.put(ball, color);
            result[i] = colorsCount;
        }
        return result;
    }
}