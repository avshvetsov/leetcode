package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1052,
        name = "Grumpy Bookstore Owner",
        level = Level.MEDIUM,
        tags = {"Array", "Sliding Window"}
)
public class _1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int[] unsatisfied = new int[customers.length];
        int result = 0;
        for (int i = 0; i < unsatisfied.length; i++) {
            if (grumpy[i] == 1) {
                unsatisfied[i] = customers[i];
            } else result += customers[i];
        }
        int l = 0, r = minutes;
        int currSum = 0;
        for (int i = 0; i < r; i++) {
            currSum += unsatisfied[i];
        }
        int maxSum = currSum;
        while (r < unsatisfied.length) {
            currSum = currSum + unsatisfied[r] - unsatisfied[l];
            maxSum = Math.max(maxSum, currSum);
            l++;
            r++;
        }
        result += maxSum;
        return result;
    }
}