package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 3027,
        name = "Find the Number of Ways to Place People II",
        level = Level.HARD,
        tags = {"Array", "Math", "Geometry", "Sorting", "Enumeration", "Biweekly Contest 123"}
)
public class _3027 {
    public int numberOfPairs(int[][] points) {
        int res = 0;
        Arrays.sort(points, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        for (int i = 0; i < points.length; i++) {
            int yMin = Integer.MIN_VALUE;
            for (int j = i + 1; j < points.length; j++) {
                if (points[j][1] > yMin && points[j][1] <= points[i][1]) {
                    res++;
                    yMin = points[j][1];
                }
            }
        }
        return res;
    }
}