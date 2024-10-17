package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Comparator;
import java.util.PriorityQueue;

@LeetCode(
        number = 1405,
        name = "Longest Happy String",
        level = Level.MEDIUM,
        tags = {"String", "Greedy", "Heap (Priority Queue)"}
)
public class _1405 {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(ints -> ints[0], Comparator.reverseOrder()));
        pq.offer(new int[]{a, 'a' - 'a'});
        pq.offer(new int[]{b, 'b' - 'a'});
        pq.offer(new int[]{c, 'c' - 'a'});
        int[] prev = new int[]{0, 0};
        int[] curr = pq.poll();
        while (curr[0] > 0) {
            if (curr[1] == prev[1]) {
                if (prev[0] < 2) {
                    prev[0]++;
                    curr[0]--;
                } else {
                    int[] next = pq.poll();
                    pq.offer(curr);
                    curr = next;
                    if (curr[0] > 0) {
                        curr[0]--;
                        prev[0] = 1;
                        prev[1] = curr[1];
                    } else break;
                }
            } else {
                curr[0]--;
                prev[0] = 1;
                prev[1] = curr[1];
            }
            sb.append((char) ('a' + curr[1]));
            pq.offer(curr);
            curr = pq.poll();
        }
        return sb.toString();
    }
}