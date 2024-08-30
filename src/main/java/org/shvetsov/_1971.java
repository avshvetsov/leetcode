package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 1971,
        name = "Find if Path Exists in Graph",
        level = Level.EASY,
        tags = {"Depth-First Search", "Breadth-First Search", "Union Find", "Graph"}
)
public class _1971 {

    //graph visualizer: https://csacademy.com/app/graph_editor/
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (edges.length == 0) return true;
        boolean result = false;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            if (graph.containsKey(edges[i][0])) {
                graph.get(edges[i][0]).add(edges[i][1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(edges[i][1]);
                graph.put(edges[i][0], list);
            }

            if (graph.containsKey(edges[i][1])) {
                graph.get(edges[i][1]).add(edges[i][0]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(edges[i][0]);
                graph.put(edges[i][1], list);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        Set<Integer> visited = new HashSet<>();
        visited.add(source);
        while (!queue.isEmpty()) {
            Integer curr = queue.poll();
            List<Integer> next = graph.get(curr);
            if (next != null) {
                if (next.contains(destination)) {
                    result = true;
                    break;
                }
                next.removeIf(visited::contains);
                //можем помечать их как visited, потому что они и так добавлены в queue и соответственно через них будет проход
                visited.addAll(next);
                queue.addAll(next);
            }
        }
        return result;
    }

    public static class UnionFind2 {
        public boolean validPath(int n, int[][] edges, int source, int destination) {
            UF uf = new UF(n);
            for (int[] edge : edges) {
                uf.union(edge[0], edge[1]);
            }
            return uf.find(source) == uf.find(destination);
        }

        private class UF {
            private int[] nodes;

            public UF(int n) {
                nodes = new int[n];
                for (int i = 0; i < nodes.length; i++) {
                    nodes[i] = i;
                }
            }

            public void union(int p, int q) {
                int rootP = find(p);
                int rootQ = find(q);
                nodes[rootP] = rootQ;
            }

            public int find(int p) {
                while (nodes[p] != p) {
                    p = nodes[p];
                }
                return p;
            }
        }
    }

    public static class BFS {
        public boolean validPath(int n, int[][] edges, int source, int destination) {
            Map<Integer, List<Integer>> graph = new HashMap<>();
            for (int[] edge : edges) {
                int f = edge[0];
                int t = edge[1];
                graph.computeIfAbsent(f, k -> new ArrayList<>()).add(t);
                graph.computeIfAbsent(t, k -> new ArrayList<>()).add(f);
            }
            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[n];

            queue.offer(source);
            visited[source] = true;

            while (!queue.isEmpty()) {
                int node = queue.poll();
                if (node == destination) {
                    return true;
                }
                List<Integer> neighbors = graph.getOrDefault(node, new ArrayList<>());
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                    }
                }
            }
            return false;
        }
    }

    public static class DFS{
        public boolean validPath(int n, int[][] edges, int source, int destination) {
            Map<Integer, List<Integer>> graph = new HashMap<>();
            for (int[] edge : edges) {
                int f = edge[0];
                int t = edge[1];
                graph.computeIfAbsent(f, k -> new ArrayList<>()).add(t);
                graph.computeIfAbsent(t, k -> new ArrayList<>()).add(f);
            }
            boolean[] visited = new boolean[n];

            return validPathHelper(graph, source, destination, visited);
        }

        private boolean validPathHelper(Map<Integer, List<Integer>> graph, int current, int destination, boolean[] visited) {
            if (current == destination) {
                return true;
            }
            visited[current] = true;
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    if (validPathHelper(graph, neighbor, destination, visited)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class UnionFind {
        private int[] parent;
        private int[] rank;

        public boolean validPath(int n, int[][] edges, int source, int destination) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
            for (int[] edge : edges) {
                union(edge[0], edge[1]);
            }
            return find(source) == find(destination);
        }

        private int find(int val) {
            if (parent[val] != val) {
                parent[val] = find(parent[val]);
            }
            return parent[val];
        }

        private void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                rank[rootX]++;
                parent[rootY] = rootX;
            }
        }
    }
}