package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;

@LeetCode(
        number = 3066,
        name = "Minimum Operations to Exceed Threshold Value II",
        level = Level.MEDIUM,
        tags = {"Array", "Heap (Priority Queue)", "Simulation"}
)
public class _3066 {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(
                Arrays.stream(nums)
                        .mapToObj(Long::valueOf)
                        .toList()
        );
        int count = 0;
        while (pq.size() >= 2 && pq.peek() < k) {
            Long x = pq.poll();
            Long y = pq.poll();
            pq.add(x * 2 + y);
            count++;
        }
        return count;
    }
}