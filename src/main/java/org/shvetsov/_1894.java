package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 1894,
        name = "Find the Student that Will Replace the Chalk",
        level = Level.MEDIUM,
        tags = {"Array", "Binary Search", "Simulation", "Prefix Sum"}
)
public class _1894 {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long sum = Arrays.stream(chalk).mapToLong(Long::valueOf).sum();
        k = (int) (k % sum);
        int i = 0;
        while (k - chalk[i] >= 0) {
            k -= chalk[i];
            i = (i + 1) % n;
        }
        return i % n;
    }
}