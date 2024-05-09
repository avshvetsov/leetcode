package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 3075,
        name = "Maximize Happiness of Selected Children",
        level = Level.MEDIUM,
        tags = {"Array", "Greedy", "Sorting"}
)
public class _3075 {
    public long maximumHappinessSum(int[] happiness, int k) {
        long res = 0;
        int n = happiness.length;
        Arrays.sort(happiness);
        for (int i = 0; i < k; i++) {
            res += Math.max(happiness[n - i - 1] - i, 0);
        }
        return res;
    }
}