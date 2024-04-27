package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 100286,
        name = "Make a Square with the Same Color",
        level = Level.EASY,
        tags = {}
)
public class _100286 {
    public boolean canMakeSquare(char[][] grid) {
        int[][] s = new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 1}};
        for (int[] curr : s) {
            int b = 0;
            for (int[] d : s) {
                if (grid[curr[0] + d[0]][curr[1] + d[1]] == 'B') b++;
            }
            if (b != 2) return true;
        }
        return false;
    }

}