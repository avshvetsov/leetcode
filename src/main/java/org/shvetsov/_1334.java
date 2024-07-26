package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;
import java.util.stream.Stream;

@LeetCode(
        number = 1334,
        name = "Find the City With the Smallest Number of Neighbors at a Threshold Distance",
        level = Level.MEDIUM,
        tags = {"Dynamic Programming", "Graph", "Shortest Path"}
)
public class _1334 {

    Map<Integer, List<int[]>> graph = new HashMap<>();

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        for (int[] edge : edges) {
            if (edge[2] <= distanceThreshold) {
                graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(new int[]{edge[1], edge[2]});
                graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(new int[]{edge[0], edge[2]});
            }
        }
        List<Neighbor>[] neighbors = new List[n];
        for (int i = 0; i < n; i++) {
            neighbors[i] = new ArrayList<>();
            neighbors[i].add(new Neighbor(true, i, 0));
            List<int[]> next = graph.getOrDefault(i, Collections.emptyList());
            for (int[] nextNode : next) {
                neighbors[i].add(new Neighbor(false, nextNode[0], nextNode[1]));
            }
        }
        Integer minNeighborsCount = countMinNeighbors(neighbors);
        while (!containsAllProcessedNode(neighbors, minNeighborsCount)) {
            countNextNeighbors(neighbors, minNeighborsCount, distanceThreshold);
            minNeighborsCount = countMinNeighbors(neighbors);
        }

        for (int i = neighbors.length - 1; i >= 0; i--) {
            List<Neighbor> nl = neighbors[i];
            if (nl.size() == minNeighborsCount && nl.stream().allMatch(neighbor -> neighbor.isProcessed)) {
                return i;
            }
        }
        return -1;
    }

    private void countNextNeighbors(List<Neighbor>[] neighbors, Integer minNeighborsCount, Integer distanceThreshold) {
        for (int i = 0; i < neighbors.length; i++) {
            List<Neighbor> neighborList = neighbors[i];
            List<Neighbor> newNeighborList = new ArrayList<>(neighborList);
            if (neighborList.size() == minNeighborsCount) {
                for (Neighbor neighbor : neighborList) {
                    if (!neighbor.isProcessed) {
                        List<int[]> next = graph.get(neighbor.num);
                        for (int[] nextNode : next) {
                            Neighbor newNeighbor = new Neighbor(false, nextNode[0], neighbor.distance + nextNode[1]);
                            if (newNeighbor.distance <= distanceThreshold) {
                                if (!newNeighborList.contains(newNeighbor)) {
                                    newNeighborList.add(newNeighbor);
                                } else {
                                    for (Neighbor existing : newNeighborList) {
                                        if (newNeighbor.num == existing.num && newNeighbor.distance < existing.distance) {
                                            existing.distance = newNeighbor.distance;
                                            existing.isProcessed = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    neighbor.isProcessed = true;
                }
            }
            neighbors[i] = newNeighborList;
        }
    }

    private boolean containsAllProcessedNode(List<Neighbor>[] neighbors, Integer minNeighborCount) {
            return Arrays.stream(neighbors)
                    .filter(neighbor -> neighbor.size() == minNeighborCount)
                    .allMatch(neighbor -> neighbor.stream().allMatch(n -> n.isProcessed));
    }

    private Integer countMinNeighbors(List<Neighbor>[] neighbors) {
        return Arrays.stream(neighbors)
                .map(List::size)
                .min(Comparator.comparingInt(Integer::intValue))
                .orElse(0);
    }

    public static class Neighbor {
        private boolean isProcessed;
        private int num;
        private int distance;

        public Neighbor(boolean isProcessed, int num, int distance) {
            this.isProcessed = isProcessed;
            this.num = num;
            this.distance = distance;
        }

        @Override
        public final boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Neighbor neighbor)) return false;

            return num == neighbor.num;
        }

        @Override
        public int hashCode() {
            return num;
        }
    }
}