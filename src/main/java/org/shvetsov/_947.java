package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 947,
        name = "Most Stones Removed with Same Row or Column",
        level = Level.MEDIUM,
        tags = {"Hash Table", "Depth-First Search", "Union Find", "Graph"},
        todo = {"Not optimal", "Union Find"}
)
public class _947 {

    public int removeStones(int[][] stones) {
        return 0;
    }

    public static class MapSolution {
        public int removeStones(int[][] stones) {
            Map<Integer, List<Stone>> graphRow = new HashMap<>();
            Map<Integer, List<Stone>> graphCol = new HashMap<>();
            Set<Stone> stoneSet = new HashSet<>();
            for (int[] stone : stones) {
                Stone s = new Stone(stone[0], stone[1]);
                stoneSet.add(s);
                graphRow.computeIfAbsent(s.row, k -> new ArrayList<>()).add(s);
                graphCol.computeIfAbsent(s.col, k -> new ArrayList<>()).add(s);
            }
            int groups = 0;
            while (!stoneSet.isEmpty()) {
                Stone stone = stoneSet.stream().findFirst().get();
                visitStones(graphRow, graphCol, stoneSet, stone);
                groups++;
            }
            return stones.length - groups;
        }

        private void visitStones(Map<Integer, List<Stone>> graphRow, Map<Integer, List<Stone>> graphCol, Set<Stone> stoneSet, Stone stone) {
            stoneSet.remove(stone);
            for (Stone curr : graphRow.get(stone.row)) {
                if (stoneSet.contains(curr)) {
                    visitStones(graphRow, graphCol, stoneSet, curr);
                }
            }
            for (Stone curr : graphCol.get(stone.col)) {
                if (stoneSet.contains(curr)) {
                    visitStones(graphRow, graphCol, stoneSet, curr);
                }
            }
        }

        private record Stone(int row, int col) {}
    }
}