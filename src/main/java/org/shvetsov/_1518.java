package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1518,
        name = "Water Bottles",
        level = Level.EASY,
        tags = {"Math", "Simulation"}
)
public class _1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = 0;
        int freeBottles = 0;
        while (numBottles > 0) {
            result += numBottles;
            freeBottles += numBottles;
            numBottles = freeBottles / numExchange;
            freeBottles -= numBottles * numExchange;
        }
        return result;
    }
}