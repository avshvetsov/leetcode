package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

@LeetCode(
        number = 1942,
        name = "The Number of the Smallest Unoccupied Chair",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Heap (Priority Queue)"}
)
public class _1942 {
    public int smallestChair(int[][] times, int targetFriend) {
        int targetArrival = times[targetFriend][0];
        PriorityQueue<Integer> free = new PriorityQueue<>(Comparator.naturalOrder());
        for (int i = 0; i < times.length; i++) {
            free.offer(i);
        }
        PriorityQueue<int[]> arrivals = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Action> leaves = new PriorityQueue<>(Comparator.comparingInt(value -> value.time));
        for (int[] time : times) {
            arrivals.offer(time);
        }
        int[] arrival = arrivals.poll();
        while (arrival[0] != targetArrival) {
            leaves.offer(new Action(arrival[1], free.poll()));

            arrival = arrivals.poll();
            while (!leaves.isEmpty() && leaves.peek().time <= arrival[0]) {
                free.offer(leaves.poll().chair);
            }
        }
        return free.poll();
    }

    public static class Action {
        public final int time;
        public final int chair;

        public Action(int time, int chair) {
            this.time = time;
            this.chair = chair;
        }
    }

}