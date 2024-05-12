package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.Comparator;

@LeetCode(
        number = 857,
        name = "Minimum Cost to Hire K Workers",
        level = Level.HARD,
        tags = {"Array", "Greedy", "Sorting", "Heap (Priority Queue)"}
)
public class _857 {

    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {

        return 0;
    }

    public static class NotCorrect2 {

        public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
            int n = quality.length;
            double[][] deltaMatrix = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    deltaMatrix[i][j] = countWage(new int[]{quality[i], wage[i]}, new int[]{quality[j], wage[j]}) /*- wage[i]*/;
                }
            }
            double[] sum = new double[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sum[i] += deltaMatrix[i][j];
                    sum[j] += deltaMatrix[i][j];
                }
            }

            int[] deletedWorkers = new int[n];
            int l = n;
            while (l > k) {
                //найти макс в sum
                int worker = 0;
                double max = Double.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    if (sum[i] > max) {
                        max = sum[i];
                        worker = i;
                    }
                }

                deletedWorkers[worker] = k;

                //вычесть из deltaMatrix значения вычеркнутого сотрудника
                for (int i = 0; i < n; i++) {
                    sum[i] -= deltaMatrix[worker][i];
                    sum[i] -= deltaMatrix[i][worker];
                    deltaMatrix[worker][i] = 0;
                    deltaMatrix[i][worker] = 0;
                }
                sum[worker] = 0;
                l--;
            }

            double res = 0;
            for (int i = 0; i < n; i++) {
                double max = Double.MIN_VALUE;
                for (int j = 0; j < n; j++) {
                    max = Math.max(max, deltaMatrix[i][j]);
                }
                res += max;
            }

            return res;
        }

        private double countWage(int[] curr, int[] depends) {
            double fairWage = (double) (depends[1] * curr[0]) / depends[0];
            return curr[1] > fairWage ? curr[1] : fairWage;
        }
    }


    public static class NotCorrect {
        public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
            if (k == 1) {
                return Arrays.stream(wage).min().orElseGet(() -> 0);
            }

            int n = quality.length;
            double[][] wq = new double[n][2];
            for (int i = 0; i < n; i++) {
                wq[i][0] = (double) wage[i] / quality[i];
                wq[i][1] = i;
            }
            Arrays.sort(wq, Comparator.comparingDouble(value -> value[0]));

            int i = 0, j = k - 1;
            double res = Double.MAX_VALUE;
            while (j < n) {
                double currSum = 0;
                double maxFraction = wq[j][0];
                for (int l = i; l <= j; l++) {
                    int pos = (int) wq[l][1];
                    currSum += maxFraction * quality[pos];
                }
                res = Math.min(res, currSum);
                i++;
                j++;
            }
            return res;
        }
    }
}