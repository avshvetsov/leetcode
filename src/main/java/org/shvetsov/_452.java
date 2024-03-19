package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 452,
        name = "Minimum Number of Arrows to Burst Balloons",
        level = Level.MEDIUM,
        tags = {"Array", "Greedy", "Sorting"}
)
public class _452 {

    public int findMinArrowShots(int[][] points) {
        int arrows = 1;
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int arr = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > arr) {
                arrows++;
                arr = points[i][1];
            }
        }
        return arrows;
    }

    public int findMinArrowShotsInefficient(int[][] points) {
        List<Balloon> balloons = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            balloons.add(new Balloon(points[i][0], points[i][1]));
        }
        balloons.sort(Comparator.comparingInt(Balloon::end));
        int arrows = 0;
        while (!balloons.isEmpty()) {
            int arr = balloons.getFirst().end();
            balloons.removeIf(balloon -> balloon.start() <= arr && arr <= balloon.end());
            arrows++;
        }
        return arrows;
    }

    private record Balloon(int start, int end) {

    }
}