package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 498,
        name = "Diagonal Traverse",
        level = Level.MEDIUM,
        tags = {"Array", "Matrix", "Simulation"}
)
public class _498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        if (n == 1) {
            return mat[0];
        } else if (m == 1) {
            int[] res = new int[n * m];
            for (int i = 0; i < res.length; i++) {
                res[i] = mat[i][0];
            }
            return res;
        }
        int[] res = new int[n * m];
        int i = 0, r = 0, c = 0;
        boolean direction = false;
        while (i < res.length) {
            if (r == 0 && c == m - 1) {
                res[i++] = mat[r++][c];
                direction = !direction;
            } else if (c == 0 && r == n - 1) {
                res[i++] = mat[r][c++];
                direction = !direction;
            } else if (r == 0 || r == n - 1) {
                res[i++] = mat[r][c++];
                direction = !direction;
            } else if (c == 0 || c == m - 1) {
                res[i++] = mat[r++][c];
                direction = !direction;
            }

            if (direction) {
                res[i++] = mat[r++][c--];
            } else {
                res[i++] = mat[r--][c++];
            }
        }
        return res;
    }
}