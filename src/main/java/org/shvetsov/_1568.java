package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 1568,
        name = "Minimum Number of Days to Disconnect Island",
        level = Level.HARD,
        tags = {"Array", "Depth-First Search", "Breadth-First Search", "Matrix", "Strongly Connected Component"}
)
public class _1568 {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int minDays(int[][] grid) {

        //count islands
        int[][] gridCopy = copyGrid(grid);
        int cnt = countIsland(gridCopy);
        if (cnt != 1) {
            return 0;
        }
        if (canWeSeparateIslandInOneTurn(grid)) {
            return 1;
        }
        return 2;
    }

    private boolean canWeSeparateIslandInOneTurn(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    int cntNeighborIsland = 0;
                    int[][] gridCopy = copyGrid(grid);
                    for (int[] dir : dirs) {
                        int ii = i + dir[0];
                        int jj = j + dir[1];
                        if (ii >= 0 && jj >= 0 && ii < gridCopy.length && jj < gridCopy[0].length && gridCopy[ii][jj] == 1) {
                            expandLand(gridCopy, ii, jj);
                            cntNeighborIsland++;
                        }
                    }
                    if (cntNeighborIsland > 1 || cntNeighborIsland == 0) {
                        return true;
                    }
                    grid[i][j] = 1;
                }
            }
        }
        return false;
    }

    private int[][] copyGrid(int[][] grid) {
        int[][] gridCopy = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                gridCopy[i][j] = grid[i][j];
            }
        }
        return gridCopy;
    }

    private int countIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    expandLand(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    private void expandLand(int[][] grid, int i, int j) {
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[i].length && grid[i][j] == 1) {
            grid[i][j] = 0;
            for (int[] dir : dirs) {
                expandLand(grid, i + dir[0], j + dir[1]);
            }
        }
    }
}