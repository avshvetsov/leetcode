package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 3025,
        name = "Find the Number of Ways to Place People I",
        level = Level.MEDIUM,
        tags = {"Array", "Math", "Geometry", "Sorting", "Enumeration", "Biweekly Contest 123"}
)
public class _3025 {
    public int numberOfPairs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int[] pointA = points[i];
                int[] pointB = points[j];
                if (pointA[0] <=  pointB[0] && pointA[1] >= pointB[1]) {
                    if (Arrays.stream(points)
                            .filter(point -> point[0] >= pointA[0] && point[0] <= pointB[0])
                            .filter(point -> point[1] <= pointA[1] && point[1] >= pointB[1])
                            .count() == 2) {
                        res++;
                    }
                }
            }
        }
        return res;
    }
}