package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 2601,
        name = "Prime Subtraction Operation",
        level = Level.MEDIUM,
        tags = {"Array", "Math", "Binary Search", "Greedy", "Number Theory"}
)
public class _2601 {
    public boolean primeSubOperation(int[] nums) {
        if (nums.length <= 1) return true;
        //build primes until 1000
        boolean[] primes = new boolean[1001];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length / 2; i++) {
            if (primes[i]) {
                int j = i + i;
                while (j < primes.length) {
                    primes[j] = false;
                    j += i;
                }
            }
        }
        nums[0] = nums[0] - findMaxPrimeBetween(primes, 0, nums[0]);
        if (nums[0] >= nums[1]) {
            return false;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            nums[i] = nums[i] - findMaxPrimeBetween(primes, Math.max(nums[i] - nums[i + 1] + 1, 0), nums[i] - nums[i - 1]);
            if (nums[i] >= nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private int findMaxPrimeBetween(boolean[] primes, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (primes[i]) return i;
        }
        return 0;
    }
}