package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 463,
        name = "Island Perimeter",
        level = Level.EASY,
        tags = {"Array", "Depth-First Search", "Breadth-First Search", "Matrix"}
)
public class _463 {

    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (i - 1 < 0 || grid[i - 1][j] == 0) result++;
                    if (i + 1 >= grid.length || grid[i + 1][j] == 0) result++;
                    if (j - 1 < 0 || grid[i][j - 1] == 0) result++;
                    if (j + 1 >= grid[0].length || grid[i][j + 1] == 0) result++;
                }
            }
        }
        return result;
    }
}