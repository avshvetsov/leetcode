package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Comparator;
import java.util.PriorityQueue;

@LeetCode(
        number = 703,
        name = "Kth Largest Element in a Stream",
        level = Level.EASY,
        tags = {"Tree", "Design", "Binary Search Tree", "Heap (Priority Queue)", "Binary Tree", "Data Stream"}
)
public class _703 {

    static class KthLargest {

        private final PriorityQueue<Integer> pq;

        public KthLargest(int k, int[] nums) {
            pq = new PriorityQueue<>(k, Comparator.naturalOrder());
            if (k > nums.length) {
                pq.add(Integer.MIN_VALUE);
            }
            for (int i = 0; i < nums.length; i++) {
                if (i < k) pq.add(nums[i]);
                else if (pq.peek() < nums[i]) {
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        }

        public int add(int val) {
            if (pq.peek() < val) {
                pq.add(val);
                pq.poll();
            }
            return pq.peek();
        }
    }

}