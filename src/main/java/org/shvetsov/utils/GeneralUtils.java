package org.shvetsov.utils;

import java.util.ArrayList;
import java.util.List;

public class GeneralUtils {

    private GeneralUtils() {
    }

    public static List<List<Integer>> twoDimArrayToListOfLists(int[][] arr) {
        List<List<Integer>> res = new ArrayList<>();
        for (int[] row : arr) {
            List<Integer> listRow = new ArrayList<>();
            for (int val : row) {
                listRow.add(val);
            }
            res.add(listRow);
        }
        return res;
    }
}
