package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Comparator;
import java.util.PriorityQueue;

@LeetCode(
        number = 786,
        name = "K-th Smallest Prime Fraction",
        level = Level.MEDIUM,
        tags = {"Array", "Two Pointers", "Binary Search", "Sorting", "Heap (Priority Queue)"}
)
public class _786 {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
//        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(arr[a[0]] * arr[b[1]], arr[a[1]] * arr[b[0]]));
//        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> Float.compare((float) arr[o1[0]] / arr[o1[1]], (float) arr[o2[0]] / arr[o2[1]]));
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingDouble(value -> (double) arr[value[0]] / arr[value[1]]));
        for (int i = 0; i < arr.length - 1; i++) {
            pq.offer(new int[]{i, arr.length - 1});
        }
        int[] curr = null;
        while (k > 0) {
            curr = pq.poll();
            if (curr[1] > curr[0] + 1) pq.offer(new int[]{curr[0], curr[1] - 1});
            k--;
        }
        return new int[]{arr[curr[0]], arr[curr[1]]};
    }
}