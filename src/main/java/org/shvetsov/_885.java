package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 885,
        name = "Spiral Matrix III",
        level = Level.MEDIUM,
        tags = {"Array", "Matrix", "Simulation"}
)
public class _885 {

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int area = rows * cols;
        int[][] matrix = new int[area][2];
        int i = 0;
        matrix[i++] = new int[]{rStart, cStart};
        int currRow = rStart;
        int currCol = cStart;
        int steps = 1;
        int direction = 0;
        while (i < area) {
            for (int j = 0; j < steps; j++) {
                currRow += directions[direction % 4][0];
                currCol += directions[direction % 4][1];
                if (currRow >= 0 && currRow < rows && currCol >= 0 && currCol < cols) {
                    matrix[i][0] = currRow;
                    matrix[i][1] = currCol;
                    i++;
                }
            }
            direction++;
            if (direction % 2 == 0) {
                steps++;
            }
        }
        return matrix;
    }
}