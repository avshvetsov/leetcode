package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

@LeetCode(
        number = 2812,
        name = "Find the Safest Path in a Grid",
        level = Level.MEDIUM,
        tags = {"Array", "Binary Search", "Breadth-First Search", "Union Find", "Matrix"}
)
public class _2812 {

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        //find manhattan distance from any cell to any thief
        int[][] manhattanDistance = new int[grid.size()][grid.get(0).size()];
        for (int[] row : manhattanDistance) {
            Arrays.fill(row, -1);
        }
        int dist = 0;
        List<int[]> points = new ArrayList<>();
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                if (grid.get(i).get(j) == 1) {
                    points.add(new int[]{i, j});
                    manhattanDistance[i][j] = dist;
                }
            }
        }
        dist++;
        while (!points.isEmpty()) {
            List<int[]> newPoints = new ArrayList<>();
            for (int[] point : points) {
                for (int[] dir : dirs) {
                    int i = point[0] + dir[0];
                    int j = point[1] + dir[1];
                    if (i >= 0 && i < n && j >= 0 && j < n && manhattanDistance[i][j] == -1) {
                        manhattanDistance[i][j] = dist;
                        newPoints.add(new int[]{i, j});
                    }
                }
            }
            points = newPoints;
            dist++;
        }

        //find shortest path
        int res = manhattanDistance[0][0];
//        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(value -> value[2], Comparator.reverseOrder()));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        pq.offer(new int[]{0, 0, res});
        manhattanDistance[0][0] = -1;
        while (!pq.isEmpty()) {
            int[] point = pq.poll();
            int currDist = point[2];
            res = Math.min(res, currDist);
            if (currDist == 0) {
                return 0;
            }
            if (point[0] == n - 1 && point[1] == n - 1) break;

            for (int[] dir : dirs) {
                int i = point[0] + dir[0];
                int j = point[1] + dir[1];
                if (i >= 0 && i < n && j >= 0 && j < n && manhattanDistance[i][j] != -1) {
                    pq.offer(new int[]{i, j, manhattanDistance[i][j]});
                    manhattanDistance[i][j] = -1;
                }
            }
        }
        return res;
    }
}