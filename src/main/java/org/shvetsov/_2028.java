package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 2028,
        name = "Find Missing Observations",
        level = Level.MEDIUM,
        tags = {"Array", "Math", "Simulation"}
)
public class _2028 {
    static final int MIN = 1;
    static final int MAX = 6;
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int total = rolls.length + n;
        int totalSum = mean * total;
        int rollSum = 0;
        for (int roll : rolls) {
            rollSum += roll;
        }
        int notEnough = totalSum - rollSum;
        if (notEnough >= n * MIN && notEnough <= n * MAX) {
            int main = notEnough / n;
            int side = notEnough % n;
            int[] result = new int[n];
            for (int i = 0; i < result.length; i++) {
                if (side > 0) {
                    result[i] = main + 1;
                    side--;
                } else {
                    result[i] = main;
                }
            }
            return result;
        } else return new int[0];
    }
}