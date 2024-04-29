package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 834,
        name = "Sum of Distances in Tree",
        level = Level.HARD,
        tags = {"Dynamic Programming", "Tree", "Depth-First Search", "Graph"}
)
public class _834 {

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        Set<Integer>[] graph = new Set[n];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new HashSet<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        int[][] dp = new int[n][n];

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i] += sumHelper(graph, dp, i, j, -1);
            }
        }
        return res;
    }

    private int sumHelper(Set<Integer>[] graph, int[][] dp, int current, int target, int prev) {
        if (dp[current][target] != 0) return dp[current][target];
        Set<Integer> nexts = graph[current];
        if (current == target) {
            return 0;
        }
        for (int next : nexts) {
            if (next != prev) {
                int d = sumHelper(graph, dp, next, target, current);
                if (d >= 0) {
                    dp[current][target] = d + 1;
                    dp[target][current] = d + 1;
                    return d + 1;
                }
            }
        }
        return -1;
    }

    public static class MemoryEfficient {

        private int[] count;
        private int[] res;
        private int n;
        private Map<Integer, List<Integer>> graph;

        public int[] sumOfDistancesInTree(int n, int[][] edges) {
            this.n = n;
            count = new int[n];
            res = new int[n];
            graph = new HashMap<>();
            for (int[] edge : edges) {
                this.graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
                this.graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
            }
            calculateCountChild(0, -1);
            calculateDistances(0, -1);
            return res;
        }

        private int calculateCountChild(int current, int prev) {
            if (count[current] > 0) return count[current];
            int res = 1;
            for (int next : graph.getOrDefault(current, Collections.emptyList())) {
                if (next != prev) {
                    res += calculateCountChild(next, current);
                }
            }
            count[current] = res;
            return res;
        }

        private void calculateDistances(int current, int prev) {
            if (prev == -1) {
                this.res[current] = calculateSingleDistance(0);
                for (Integer next : graph.getOrDefault(current, Collections.emptyList())) {
                    calculateDistances(next, current);
                }
            } else {
                if (count[prev] != 0) {
                    res[current] = res[prev] - count[current] + (n - count[current]);
                    for (int next : graph.get(current)) {
                        if (next != prev) {
                            calculateDistances(next, current);
                        }
                    }
                }

            }
        }

        private int calculateSingleDistance(int current) {
            int res = 0;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(current);
            Set<Integer> visited = new HashSet<>();
            while (!queue.isEmpty()) {
                int cur = queue.poll();
                visited.add(cur);
                for (Integer next : graph.getOrDefault(cur, Collections.emptyList())) {
                    if (!visited.contains(next)) {
                        res += count[next];
                        queue.offer(next);
                    }
                }
            }
            return res;
        }

    }

}