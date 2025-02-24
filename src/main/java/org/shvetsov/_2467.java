package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 2467,
        name = "Most Profitable Path in a Tree",
        level = Level.MEDIUM,
        tags = {"Array", "Tree", "Depth-First Search", "Breadth-First Search", "Graph"}
)
public class _2467 {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }
        Map<Integer, Integer> bobsRouteNodeStep = new HashMap<>();
        if (!findBobPath(graph, bobsRouteNodeStep, new boolean[amount.length], bob, 0)) {
            throw new IllegalStateException("Bobs path not found");
        }
        return maxProfit(graph, bobsRouteNodeStep, amount, new HashSet<>(), 0, 0);
    }

    private boolean findBobPath(Map<Integer, List<Integer>> graph, Map<Integer, Integer> bobPath, boolean[] visited, int sourceNode, int time) {
        bobPath.put(sourceNode, time);
        visited[sourceNode] = true;
        if (sourceNode == 0) {
            return true;
        }
        for (Integer adjustment : graph.get(sourceNode)) {
            if (!visited[adjustment] && findBobPath(graph, bobPath, visited, adjustment, time + 1)) {
                return true;
            }
        }
        bobPath.remove(sourceNode);
        return false;
    }

    private int maxProfit(Map<Integer, List<Integer>> graph, Map<Integer, Integer> bobsRouteNodeStep, int[] amount, Set<Integer> visited, int node, int step) {
        int value = 0;
        if (!bobsRouteNodeStep.containsKey(node) || bobsRouteNodeStep.get(node) > step) {
            value = amount[node];
        } else if (bobsRouteNodeStep.get(node) == step) {
            value = amount[node] / 2;
        } else if (bobsRouteNodeStep.get(node) < step) {
            value = 0;
        }

        int result = Integer.MIN_VALUE;
        visited.add(node);
        List<Integer> neighbors = graph.get(node).stream().filter(i -> !visited.contains(i)).toList();
        if (neighbors.isEmpty()) {
            return value;
        } else {
            for (Integer next : neighbors) {
                result = Math.max(result, maxProfit(graph, bobsRouteNodeStep, amount, visited, next, step + 1));
            }
            return result + value;
        }
    }
}