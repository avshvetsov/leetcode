package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 959,
        name = "Regions Cut By Slashes",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Depth-First Search", "Breadth-First Search", "Union Find", "Matrix"}
)
public class _959 {
    public int regionsBySlashes(String[] grid) {
        //Construct binary grid
        int[][] binaryGrid = new int[grid.length * 3][grid.length * 3];
        int row = 0;
        for (String s : grid) {
            int col = 0;
            for (char c : s.toCharArray()) {
                switch (c) {
                    case '/' -> {
                        binaryGrid[row + 2][col] = 1;
                        binaryGrid[row + 1][col + 1] = 1;
                        binaryGrid[row][col + 2] = 1;
                    }
                    case '\\' -> {
                        binaryGrid[row][col] = 1;
                        binaryGrid[row + 1][col + 1] = 1;
                        binaryGrid[row + 2][col + 2] = 1;
                    }
                }
                col += 3;
            }
            row += 3;
        }
        //count number of regions
        int regions = 0;
        for (int i = 0, binaryGridLength = binaryGrid.length; i < binaryGridLength; i++) {
            for (int j = 0; j < binaryGrid[i].length; j++) {
                if (binaryGrid[i][j] != 1) {
                    expandGrid(binaryGrid, i, j);
                    regions++;
                }
            }
        }
        return regions;
    }

    private void expandGrid(int[][] binaryGrid, int i, int j) {
        if (i >= 0 && i < binaryGrid.length && j >= 0 && j < binaryGrid[i].length && binaryGrid[i][j] != 1) {
            binaryGrid[i][j] = 1;
            expandGrid(binaryGrid, i + 1, j);
            expandGrid(binaryGrid, i - 1, j);
            expandGrid(binaryGrid, i, j + 1);
            expandGrid(binaryGrid, i, j - 1);
        }
    }
}