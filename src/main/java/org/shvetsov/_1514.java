package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 1514,
        name = "Path with Maximum Probability",
        level = Level.MEDIUM,
        tags = {"Array", "Graph", "Heap (Priority Queue)", "Shortest Path"}
)
public class _1514 {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        Map<Integer, List<GraphNode>> graph = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(new GraphNode(edge[1], succProb[i]));
            graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(new GraphNode(edge[0], succProb[i]));
        }
        return dijkstra(graph, start_node, end_node);
    }

    private double dijkstra(Map<Integer, List<GraphNode>> graph, int startNode, int endNode) {
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<GraphNode> pq = new PriorityQueue<>(Comparator.comparing(node -> node.probability, Comparator.reverseOrder()));
        pq.add(new GraphNode(startNode, 1));
        while (!pq.isEmpty()) {
            GraphNode current = pq.poll();
            if (current.vertex == endNode) return current.probability;
            List<GraphNode> nexts = graph.getOrDefault(current.vertex, Collections.emptyList());
            for (GraphNode next : nexts) {
                if (!visited.contains(next.vertex)) {
                    pq.add(new GraphNode(next.vertex, current.probability * next.probability));
                }
            }
            visited.add(current.vertex);
        }
        return 0;
    }

    private record GraphNode(int vertex, double probability) {}
}