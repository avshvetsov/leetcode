package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3100,
        name = "Water Bottles II",
        level = Level.MEDIUM,
        tags = {"Math", "Simulation", "Weekly Contest 391"}
)
public class _3100 {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int result = 0;
        int numEmptyBottles = 0;
        while (numBottles > 0 || numEmptyBottles >= numExchange) {
            if (numBottles > 0) {
                result += numBottles;
                numEmptyBottles += numBottles;
                numBottles = 0;
            } else {
                while (numEmptyBottles >= numExchange) {
                    numEmptyBottles -= numExchange;
                    numExchange++;
                    numBottles++;
                }
            }
        }
        return result;
    }


    public int maxBottlesDrunkAlternative(int numBottles, int numExchange) {
        int ans = numBottles;
        for (int empty = numBottles; empty >= numExchange; numExchange++) {
            ans++;
            empty -= numExchange - 1;
        }
        return ans;
    }
}