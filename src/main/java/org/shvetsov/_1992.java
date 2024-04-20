package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 1992,
        name = "Find All Groups of Farmland",
        level = Level.MEDIUM,
        tags = {"Array", "Depth-First Search", "Breadth-First Search", "Matrix"}
)
public class _1992 {
    public int[][] findFarmland(int[][] land) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 1) {
                    result.add(findFullLand(land, i, j));
                }
            }
        }
        return result.toArray(new int[][]{});
    }

    private int[] findFullLand(int[][] land, int i, int j) {
        int[] res = new int[]{i, j, -1, -1};
        for (int i1 = i; i1 < land.length && land[i1][j] == 1; i1++) {
            for (int j1 = j; j1 < land[i1].length && land[i1][j1] == 1; j1++) {
                land[i1][j1] = 0;
                res[3] = j1;
            }
            res[2] = i1;
        }
        return res;
    }
}