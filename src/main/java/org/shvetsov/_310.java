package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 310,
        name = "Minimum Height Trees",
        level = Level.MEDIUM,
        tags = {"Depth-First Search", "Breadth-First Search", "Graph", "Topological Sort"}
)
public class _310 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return List.of(0);
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, x -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, x -> new ArrayList<>()).add(u);
        }
        Integer start = findStartVertice(graph);
        List<Integer> longestChain = findLongestChain(graph, start, -1);
        List<Integer> result = new ArrayList<>();

        result.add(longestChain.get(longestChain.size() / 2));
        if (longestChain.size() % 2 == 0) {
            result.add(longestChain.get(longestChain.size() / 2 - 1));
        }
        return result;
    }

    private List<Integer> tempChain = new ArrayList<>();

    private List<Integer> findLongestChain(Map<Integer, List<Integer>> graph, Integer current, Integer prev) {
        List<Integer> nexts = graph.get(current);
        List<List<Integer>> result = new ArrayList<>();
        for (Integer next : nexts) {
            if (!next.equals(prev)) {
                result.add(findLongestChain(graph, next, current));
            }
        }
        result.sort(Comparator.comparingInt(List::size));
        if (result.size() >= 2) {
            List<Integer> first = new LinkedList<>(result.get(result.size() - 1));
            List<Integer> second = new LinkedList<>(result.get(result.size() - 2));
            first.add(current);
            first.addAll(second.reversed());
            if (first.size() > tempChain.size()) {
                this.tempChain = first;
            }
        }
        List<Integer> longest = new ArrayList<>();
        if (!result.isEmpty()) {
            longest = result.getLast();
        }
        longest.add(current);

        if (prev == -1) {
            return longest.size() > tempChain.size() ? longest : tempChain;
        } else return longest;
    }

    private Integer findStartVertice(Map<Integer, List<Integer>> graph) {
        return graph.entrySet().stream()
                .filter(entry -> entry.getValue().size() == 1)
                .findFirst()
                .orElseThrow().getKey();
    }


    public static class RemoveLeafApproach {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            if (n == 1) return List.of(0);

            int[] neighbors = new int[n];
            Map<Integer, List<Integer>> graph = new HashMap<>();
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                graph.computeIfAbsent(u, x -> new ArrayList<>()).add(v);
                graph.computeIfAbsent(v, x -> new ArrayList<>()).add(u);
            }
            for (Map.Entry<Integer, List<Integer>> vertice : graph.entrySet()) {
                neighbors[vertice.getKey()] = vertice.getValue().size();
            }

            while (graph.size() > 2) {
                int[] removed = new int[n];
                for (int i = 0; i < neighbors.length; i++) {
                    if (neighbors[i] == 1) {
                        neighbors[i] = 0;
                        for (Integer next : graph.remove(i)) {
                            removed[next]++;
                        }
                    }
                }
                for (int j = 0; j < n; j++) {
                    neighbors[j] -= removed[j];
                }
            }
            return graph.keySet().stream().toList();
        }
    }

}