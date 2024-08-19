package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 650,
        name = "2 Keys Keyboard",
        level = Level.MEDIUM,
        tags = {"Math", "Dynamic Programming"}
)
public class _650 {
    public int minSteps(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        findAllPrimeFactors(n, primeFactors);
        return primeFactors.stream().mapToInt(Integer::intValue).sum();
    }

    private void findAllPrimeFactors(int n, List<Integer> primeFactors) {
        if (n == 1) return;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                primeFactors.add(i);
                findAllPrimeFactors(n / i, primeFactors);
                return;
            }
        }
    }
}