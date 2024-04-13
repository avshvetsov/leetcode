package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2073,
        name = "Time Needed to Buy Tickets",
        level = Level.EASY,
        tags = {"Array", "Queue", "Simulation"}
)
public class _2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int res = 0;
        int n = tickets[k];
        for (int i = 0; i < tickets.length; i++) {
            if (i < k) {
                res += Math.min(n, tickets[i]);
            } else if (i == k) {
                res += tickets[i];
            } else {
                res += Math.min(n - 1, tickets[i]);
            }
        }
        return res;
    }
}