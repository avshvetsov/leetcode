package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 2976,
        name = "Minimum Cost to Convert String I",
        level = Level.MEDIUM,
        tags = {"Array", "String", "Graph", "Shortest Path"},
        todo = {"TLS", "Needed refactoring"}
)
public class _2976 {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        Set<Change> changes = new HashSet<>();
        for (int i = 0; i < source.toCharArray().length; i++) {
            if (source.charAt(i) != target.charAt(i)) {
                changes.add(new Change(source.charAt(i), target.charAt(i)));
            }
        }
        Map<Character, List<Node>> graph = new HashMap<>();
        for (int i = 0; i < original.length; i++) {
            graph.computeIfAbsent(original[i], k -> new ArrayList<>()).add(new Node(changed[i], cost[i]));
        }
        Map<Character, Set<Character>> changesMap = new HashMap<>();
        for (Change change : changes) {
            changesMap.computeIfAbsent(change.from, k -> new HashSet<>()).add(change.to);
        }
        Map<Change, Long> mapCost = new HashMap<>();
        for (Map.Entry<Character, Set<Character>> change : changesMap.entrySet()) {
            mapCost.putAll(dijkstra(graph, change.getKey(), change.getValue()));
        }
        long result = 0;
        for (int i = 0; i < source.toCharArray().length; i++) {
            if (source.charAt(i) != target.charAt(i)) {
                Change change = new Change(source.charAt(i), target.charAt(i));
                if (mapCost.containsKey(change)) {
                    result += mapCost.get(change);
                } else return -1;
            }
        }
        return result;
    }

    private Map<Change, Long> dijkstra(Map<Character, List<Node>> graph, char from, Set<Character> to) {
        Map<Change, Long> result = new HashMap<>();
        Set<Character> visited = new HashSet<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingLong(value -> value.cost));
        pq.add(new Node(from, 0));
        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            if (!visited.contains(curr.ch)) {
                if (to.contains(curr.ch)) {
                    result.put(new Change(from, curr.ch), curr.cost);
                }
                visited.add(curr.ch);
                if (graph.containsKey(curr.ch)) {
                    List<Node> neighbors = graph.get(curr.ch);
                    for (Node neighbor : neighbors) {
                        pq.add(new Node(neighbor.ch, neighbor.cost + curr.cost));
                    }
                }
            }
        }
        return result;
    }

    record Node(char ch, long cost) {
    }

    record Change(char from, char to) {
    }
}