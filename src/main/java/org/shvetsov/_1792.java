package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Comparator;
import java.util.PriorityQueue;

@LeetCode(
        number = 1792,
        name = "Maximum Average Pass Ratio",
        level = Level.MEDIUM,
        tags = {"Array", "Greedy", "Heap (Priority Queue)", "Weekly Contest 232"}
)
public class _1792 {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                Comparator.comparingDouble((int[] value) -> ((double) (value[0] + 1) / (value[1] + 1)) - ((double) value[0] / value[1]))
                .reversed());
        for (int[] cl : classes) {
            pq.offer(cl);
        }
        while (extraStudents > 0) {
            int[] polled = pq.poll();
            pq.add(new int[]{polled[0] + 1, polled[1] + 1});
            extraStudents--;
        }
        return pq.stream()
                .mapToDouble(value -> ((double) value[0] / value[1]))
                .average()
                .orElse(0.0);
    }
}