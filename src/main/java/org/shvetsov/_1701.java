package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1701,
        name = "Average Waiting Time",
        level = Level.MEDIUM,
        tags = {"Array", "Simulation"}
)
public class _1701 {
    public double averageWaitingTime(int[][] customers) {
        long sumOfTime = 0;
        long endCookTime = 0;
        for (int[] customer : customers) {
            int arrival = customer[0];
            int time = customer[1];
            long startCookTime = Math.max(arrival, endCookTime);
            endCookTime = startCookTime + time;
            sumOfTime += endCookTime - arrival;
        }
        return (double) sumOfTime / customers.length;
    }
}