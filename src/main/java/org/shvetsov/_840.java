package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashSet;
import java.util.Set;

@LeetCode(
        number = 840,
        name = "Magic Squares In Grid",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Math", "Matrix"}
)
public class _840 {

    public int numMagicSquaresInside(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                if (isMagic(grid, i, j)) {
                    result++;
                }
            }
        }
        return result;
    }

    private boolean isMagic(int[][] grid, int r, int c) {
        Set<Integer> unique = new HashSet<>();
        int[] sum = new int[8];
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (!unique.add(grid[i][j]) || grid[i][j] > 9 || grid[i][j] < 1) return false;
                sum[i - r] += grid[i][j];
                sum[j - c + 3] += grid[i][j];
                if (i - r == j - c) {
                    sum[6] += grid[i][j];
                }
                if (i + j - r - c == 2) {
                    sum[7] += grid[i][j];
                }
            }
        }

        for (int i : sum) {
            if (sum[0] != i) return false;
        }
        return true;
    }

}