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


    //TODO: learn how to solve 'Memory Limit Exceeded' problem
    public static class MemoryEfficientButNotMy {
        private Map<Integer, List<Integer>> graph;
        private int[] count;
        private int[] res;

        private void dfs(int node, int parent) {
            for (int child : graph.get(node)) {
                if (child != parent) {
                    dfs(child, node);
                    count[node] += count[child];
                    res[node] += res[child] + count[child];
                }
            }
        }

        private void dfs2(int node, int parent) {
            for (int child : graph.get(node)) {
                if (child != parent) {
                    res[child] = res[node] - count[child] + (count.length - count[child]);
                    dfs2(child, node);
                }
            }
        }

        public int[] sumOfDistancesInTree(int n, int[][] edges) {
            graph = new HashMap<>();
            count = new int[n];
            res = new int[n];
            Arrays.fill(count, 1);

            for (int i = 0; i < n; i++) {
                graph.put(i, new ArrayList<>());
            }

            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                graph.get(u).add(v);
                graph.get(v).add(u);
            }

            dfs(0, -1);
            dfs2(0, -1);

            return res;
        }
    }
}