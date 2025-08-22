package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3195,
        name = "Find the Minimum Area to Cover All Ones I",
        level = Level.MEDIUM,
        tags = {"Array", "Matrix", "Weekly Contest 403"}
)
public class _3195 {
    public int minimumArea(int[][] grid) {
        int l = -1, r = -1, u = -1, d = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (l == -1) {
                        l = i;
                        r = i;
                        u = j;
                        d = j;
                    } else {
                        l = Math.min(l, i);
                        r = Math.max(r, i);
                        u = Math.min(u, j);
                        d = Math.max(d, j);
                    }
                }
            }
        }
        return l == -1 ? 0 : (r - l + 1) * (d - u + 1);
    }
}