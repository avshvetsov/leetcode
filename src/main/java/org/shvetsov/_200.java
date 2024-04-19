package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashSet;
import java.util.Set;

@LeetCode(
        number = 200,
        name = "Number of Islands",
        level = Level.MEDIUM,
        tags = {"Array", "Depth-First Search", "Breadth-First Search", "Union Find", "Matrix"}
)
public class _200 {

    public int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    findFullIsland(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    private void findFullIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
            return;
        } else {
            grid[i][j] = '0';
            findFullIsland(grid, i - 1, j);
            findFullIsland(grid, i + 1, j);
            findFullIsland(grid, i, j - 1);
            findFullIsland(grid, i, j + 1);
        }
    }


    public static class WithSet {
        private final Set<Point> used = new HashSet<>();

        public int numIslands(char[][] grid) {
            int result = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1' && !used.contains(new Point(i, j))) {
                        findFullIsland(grid, i, j);
                        result++;
                    }
                }
            }
            used.clear();
            return result;
        }

        private void findFullIsland(char[][] grid, int i, int j) {
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1' || used.contains(new Point(i, j))) {
                return;
            } else {
                used.add(new Point(i, j));
                findFullIsland(grid, i - 1, j);
                findFullIsland(grid, i + 1, j);
                findFullIsland(grid, i, j - 1);
                findFullIsland(grid, i, j + 1);
            }
        }

        record Point(int x, int y) {}
    }

}