package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 502,
        name = "IPO",
        level = Level.HARD,
        tags = {"Array", "Greedy", "Sorting", "Heap (Priority Queue)"}
)
public class _502 {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        List<int[]> capProfits = new LinkedList<>();
        for (int i = 0; i < profits.length; i++) {
            capProfits.add(new int[]{capital[i], profits[i]});
        }
        capProfits.sort(Comparator.comparingInt(o -> o[0]));
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        while (!capProfits.isEmpty() && capProfits.getFirst()[0] <= w) {
            pq.add(capProfits.getFirst()[1]);
            capProfits.removeFirst();
        }
        while (!pq.isEmpty() && k > 0) {
            w += pq.poll();
            while (!capProfits.isEmpty() && capProfits.getFirst()[0] <= w) {
                pq.add(capProfits.getFirst()[1]);
                capProfits.removeFirst();
            }
            k--;
        }
        return w;
    }
}