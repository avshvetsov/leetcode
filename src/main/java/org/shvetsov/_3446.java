package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 3446,
        name = "Sort Matrix by Diagonals",
        level = Level.MEDIUM,
        tags = {"Array", "Sorting", "Matrix", "Weekly Contest 436"}
)
public class _3446 {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            List<Integer> diagonal = new LinkedList<>();
            int r = i, c = 0;
            while (r < n) {
                diagonal.add(grid[r++][c++]);
            }
            diagonal.sort(Integer::compareTo);
            while (c > 0) {
                grid[--r][--c] = diagonal.removeFirst();
            }
        }
        for (int i = 1; i < m; i++) {
            List<Integer> diagonal = new LinkedList<>();
            int r = 0, c = i;
            while (c < m) {
                diagonal.add(grid[r++][c++]);
            }
            diagonal.sort(Comparator.reverseOrder());
            while (r > 0) {
                grid[--r][--c] = diagonal.removeFirst();
            }
        }
        return grid;
    }
}