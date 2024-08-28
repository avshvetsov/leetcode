package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1905,
        name = "Count Sub Islands",
        level = Level.MEDIUM,
        tags = {"Array", "Depth-First Search", "Breadth-First Search", "Union Find", "Matrix"}
)
public class _1905 {

    private final static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int result = 0;
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[i].length; j++) {
                if (grid2[i][j] == 1) {
                    result += expandWater(grid1, grid2, i, j);
                }
            }
        }
        return result;
    }

    private int expandWater(int[][] grid1, int[][] grid2, int row, int col) {
        if (row >= 0 && row < grid2.length && col >= 0 && col < grid2[row].length && grid2[row][col] == 1) {
            int allLandExistsInGrid1 = grid1[row][col];
            grid2[row][col] = 0;
            for (int[] dir : dirs) {
                allLandExistsInGrid1 += expandWater(grid1, grid2, row + dir[0], col + dir[1]);
            }
            return allLandExistsInGrid1 == 5 ? 1 : 0;
        } else return 1;
    }
}