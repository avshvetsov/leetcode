package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

@LeetCode(
        number = 857,
        name = "Minimum Cost to Hire K Workers",
        level = Level.HARD,
        tags = {"Array", "Greedy", "Sorting", "Heap (Priority Queue)"}
)
public class _857 {

    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        //Создаем массив состоящий из отношения w/q (цена единицы q для работника) и q
        //эти 2 показателя важны, потому что сумма з/п выбранных работников всегда равна произведению
        //максимального значения w/q группы и суммы q всей группы
        double[][] wq = new double[n][2];
        for (int i = 0; i < n; i++) {
            wq[i][0] = (double) wage[i] / quality[i];
            wq[i][1] = quality[i];
        }
        //сортируем по w/q, чтобы взять группу с минимальным w/q
        Arrays.sort(wq, Comparator.comparingDouble(value -> value[0]));

        //берем группу чей w/q будет минимальным, считаем ее отправной точкой
        double[][] bestByQuality = Arrays.copyOfRange(wq, 0, k);
        double bestByQualityMaxRatio = bestByQuality[bestByQuality.length - 1][0];
        double bestByQualityQualitySum = Arrays.stream(bestByQuality).mapToDouble(value -> value[1]).sum();
        double bestByQualityResult = bestByQualityMaxRatio * bestByQualityQualitySum;
        double result = bestByQualityResult;

        //для удобства работы засовываем все q в PriorityQueue
        PriorityQueue<Double> pq = new PriorityQueue<>(k, Comparator.reverseOrder());
        for (double[] elem : bestByQuality) {
            pq.offer(elem[1]);
        }

        //берем работинков, с которыми w/q будет повышаться, но есть верояность что сумма q будет снижаться
        double[][] candidates = Arrays.copyOfRange(wq, k, n);
        for (double[] candidate : candidates) {
            //если q кандидата меньше чем самое большое q в группе, то заменяем работника с наибольшим q на кандидата и пересчитываем их з/п
            if (pq.peek() > candidate[1]) {
                Double maxQ = pq.poll();
                bestByQualityMaxRatio = candidate[0];
                bestByQualityQualitySum = bestByQualityQualitySum - maxQ + candidate[1];
                bestByQualityResult = bestByQualityMaxRatio * bestByQualityQualitySum;
                pq.offer(candidate[1]);
            }
            //если суммарная з/п лучших по q сотрудников ниже чем предыдущая лучшая (по w/q), то переприсваисвем результат
            if (bestByQualityResult < result) {
                result = bestByQualityResult;
            }
        }
        return result;
    }



    public static class NoPriorityQueue {

        public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
            int n = quality.length;
            double[][] wq = new double[n][2];
            for (int i = 0; i < n; i++) {
                wq[i][0] = (double) wage[i] / quality[i];
                wq[i][1] = quality[i];
            }
            Arrays.sort(wq, Comparator.comparingDouble(value -> value[0]));

            double[][] bestByQuality = Arrays.copyOfRange(wq, 0, k);
            double bestByQualityMaxRatio = bestByQuality[bestByQuality.length - 1][0];
            double bestByQualityQualitySum = Arrays.stream(bestByQuality).mapToDouble(value -> value[1]).sum();
            double bestByQualityResult = bestByQualityMaxRatio * bestByQualityQualitySum;
            Arrays.sort(bestByQuality, Comparator.comparing(value -> value[1], Comparator.reverseOrder()));

            double result = bestByQualityResult;

            double[][] candidates = Arrays.copyOfRange(wq, k, n);
            for (double[] candidate : candidates) {
                if (bestByQuality[0][1] > candidate[1]) {
                    bestByQualityMaxRatio = candidate[0];
                    bestByQualityQualitySum = bestByQualityQualitySum - bestByQuality[0][1] + candidate[1];
                    bestByQualityResult = bestByQualityMaxRatio * bestByQualityQualitySum;
                    bestByQuality[0] = candidate;
                    Arrays.sort(bestByQuality, Comparator.comparing(value -> value[1], Comparator.reverseOrder()));
                }
                if (bestByQualityResult < result) {
                    result = bestByQualityResult;
                }
            }
            return result;
        }
    }
}