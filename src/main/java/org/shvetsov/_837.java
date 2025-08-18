package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 837,
        name = "New 21 Game",
        level = Level.MEDIUM,
        tags = {"Math", "Dynamic Programming", "Sliding Window", "Probability and Statistics", "Weekly Contest 85"}
)
public class _837 {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n - maxPts >= k) return 1;
        double[] probability = new double[n + 1];
        probability[0] = 1;
        double windowSum = 1;
        for (int i = 1; i <= n; i++) {
            probability[i] = windowSum / maxPts;
            if (i < k) {
                windowSum += probability[i];
            }
            if (i - maxPts >= 0) {
                windowSum -= probability[i - maxPts];
            }
        }
        double result = 0;
        for (int i = k; i <= n; i++) {
            result += probability[i];
        }
        return result;
    }


    public double new21GameSimple(int n, int k, int maxPts) {
        if (n == 0 && n == k) return 1;
        double[] probability = new double[20001];
        probability[0] = 1;
        for (int i = 0; i < k; i++) {
            double nextP = probability[i] / maxPts;
            for (int j = i + 1; j <= i + maxPts; j++) {
                probability[j] += nextP;
            }
        }
        double result = 0;
        for (int i = k; i <= n; i++) {
            result += probability[i];
        }
        return result;
    }
}