package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

@LeetCode(
        number = 264,
        name = "Ugly Number II",
        level = Level.MEDIUM,
        tags = {"Hash Table", "Math", "Dynamic Programming", "Heap (Priority Queue)"}
)
public class _264 {
    public int nthUglyNumber(int n) {
        SortedSet<Long> pq = new TreeSet<>(Comparator.naturalOrder());
        pq.add(1L);
        Long curr = 1L;
        for (int i = 0; i < n; i++) {
            curr = pq.removeFirst();
            pq.add(curr * 2);
            pq.add(curr * 3);
            pq.add(curr * 5);
        }
        return curr.intValue();
    }

    public static class LinearComplexity {
        public int nthUglyNumber(int n) {
            int[] dp = new int[n + 1];
            dp[1] = 1;
            int i2 = 1, i3 = 1, i5 = 1;
            int u2 = dp[i2] * 2, u3 = dp[i3] * 3, u5 = dp[i5] * 5;
            for (int i = 2; i <= n; i++) {
                int curr = Math.min(u2, Math.min(u3, u5));
                dp[i] = curr;
                if (curr == u2) {
                    i2++;
                    u2 = dp[i2] * 2;
                }
                if (curr == u3) {
                    i3++;
                    u3 = dp[i3] * 3;
                }
                if (curr == u5) {
                    i5++;
                    u5 = dp[i5] * 5;
                }
            }
            return dp[n];
        }
    }
}