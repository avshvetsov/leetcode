package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 2070,
        name = "Most Beautiful Item for Each Query",
        level = Level.MEDIUM,
        tags = {"Array", "Binary Search", "Sorting"}
)
public class _2070 {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        NavigableMap<Integer, Integer> priceBeauty = new TreeMap<>();
        int[][] sorted = Arrays.stream(items).sorted(Comparator.comparing(value -> value[1], Comparator.reverseOrder())).toArray(int[][]::new);
        for (int[] item : sorted) {
            Map.Entry<Integer, Integer> entry = priceBeauty.floorEntry(item[0]);
            if (entry != null) {
                if (entry.getValue() < item[1]) {
                    priceBeauty.put(item[0], item[1]);
                }
            } else {
                priceBeauty.put(item[0], item[1]);
            }
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            Map.Entry<Integer, Integer> entry = priceBeauty.floorEntry(queries[i]);
            result[i] = entry != null ? entry.getValue() : 0;
        }
        return result;
    }
}