package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Comparator;
import java.util.PriorityQueue;

@LeetCode(
        number = 2530,
        name = "Maximal Score After Applying K Operations",
        level = Level.MEDIUM,
        tags = {"Array", "Greedy", "Heap (Priority Queue)"}
)
public class _2530 {
    public long maxKelements(int[] nums, int k) {
        long res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            pq.add(num);
        }
        while (k > 0) {
            Integer polled = pq.poll();
            res += polled;
            pq.add(Math.ceilDiv(polled, 3));
            k--;
        }
        return res;
    }
}