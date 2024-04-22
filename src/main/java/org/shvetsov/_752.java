package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 752,
        name = "Open the Lock",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "String", "Breadth-First Search"}
)
public class _752 {

    private final int[] pow10 = {1, 10, 100, 1000};

    public int openLock(String[] deadends, String target) {
        int sourceI = 0;
        int targetI = Integer.parseInt(target);

        int[] visitedDistance = new int[10000];
        Arrays.fill(visitedDistance, -1);
        for (String deadend : deadends) {
            int deadendI = Integer.parseInt(deadend);
            if (targetI == deadendI || sourceI == deadendI) return -1;
            visitedDistance[deadendI] = -2;
        }
        int dist = 0;
        visitedDistance[sourceI] = dist;
        boolean hasNew = true;
        while (visitedDistance[targetI] == -1 && hasNew) {
            hasNew = false;
            for (int curr = 0; curr < visitedDistance.length; curr++) {
                if (visitedDistance[curr] == dist) {
                    hasNew = true;
                    for (int pow : pow10) {
                        int d = (curr / pow) % 10;
                        for (int i = -1; i <= 1; i += 2) {
                            int z = d + i;
                            z = z == -1 ? 9 : (z == 10 ? 0 : z);
                            int neighbor = curr + (z - d) * pow;
                            if (visitedDistance[neighbor] == -1) {
                                visitedDistance[neighbor] = dist + 1;
                            }
                        }
                    }
                }
            }
            dist++;
        }
        return visitedDistance[targetI];
    }


    public static class Inefficient {
        public int openLock(String[] deadends, String target) {
            if (target.equals("0000")) {
                return 0;
            }
            int source = 0;
            int targetInt = Integer.parseInt(target);
            List<Integer> deadendsList = Arrays.stream(deadends).map(Integer::parseInt).toList();
            if (deadendsList.contains(source)) return -1;

            int dist = 0;
            boolean[] visited = new boolean[10000];
            Set<Integer> current = new HashSet<>();
            current.add(source);
            visited[source] = true;
            while (!current.isEmpty()) {
                dist++;
                Set<Integer> next = new HashSet<>();
                for (Integer i : current) {
                    for (Integer j : getNeighbors(i, deadendsList)) {
                        if (!visited[j]) {
                            next.add(j);
                        }
                    }
                }
                current = next;
                if (current.contains(targetInt)) {
                    return dist;
                }
                for (Integer i : current) {
                    visited[i] = true;
                }
            }
            return -1;
        }

        private final int[] pow10 = {1, 10, 100, 1000};

        private List<Integer> getNeighbors(int integer, List<Integer> deadendsList) {
            List<Integer> neighbors = new ArrayList<>();
            for (int p : pow10) {
                int d = (integer / p) % 10;
                for (int i = -1; i <= 1; i += 2) {
                    int z = d + i;
                    z = z == -1 ? 9 : (z == 10 ? 0 : z);
                    neighbors.add(integer + (z - d) * p);
                }
            }
            neighbors.removeIf(deadendsList::contains);
            return neighbors;
        }
    }

}