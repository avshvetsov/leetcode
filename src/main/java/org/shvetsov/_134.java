package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 134,
        name = "Gas Station",
        level = Level.MEDIUM,
        tags = {"Array", "Greedy"}
)
public class _134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int l = 0, r = 0, sum = 0, acc = 0;
        while (r < gas.length) {
            int diff = gas[r] - cost[r];
            sum += diff;
            acc += diff;
            if (acc < 0) {
                acc = 0;
                r++;
                l = r;
            } else {
                r++;
            }
        }
        if (sum < 0) {
            return -1;
        } else {
            return l;
        }
    }
}