package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2257,
        name = "Count Unguarded Cells in the Grid",
        level = Level.MEDIUM,
        tags = {"Array", "Matrix", "Simulation"}
)
public class _2257 {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char[][] grid = new char[m][n];
        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = 'W';
        }
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = 'G';
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'G') {
                    see(grid, i, j);
                }
            }
        }

        int result = 0;
        for (char[] row : grid) {
            for (char v : row) {
                if (v == Character.MIN_VALUE) result++;
            }
        }
        return result;
    }

    static int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    private void see(char[][] grid, int i, int j) {
        for (int[] dir : dirs) {
            int[] current = new int[]{i, j};
            current[0] += dir[0];
            current[1] += dir[1];
            while (current[0] >= 0 && current[1] >= 0 && current[0] < grid.length && current[1] < grid[0].length
                   && grid[current[0]][current[1]] != 'G' && grid[current[0]][current[1]] != 'W') {
                grid[current[0]][current[1]] = 'S';
                current[0] += dir[0];
                current[1] += dir[1];
            }
        }
    }
}