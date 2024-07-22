package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 2418,
        name = "Sort the People",
        level = Level.EASY,
        tags = {"Array", "Hash Table", "String", "Sorting"}
)
public class _2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] sortedH = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedH);
        for (int i = sortedH.length - 1; i >= 0; i--) {
            map.put(sortedH[i], sortedH.length - 1 - i);
        }
        String[] res = new String[names.length];
        for (int i = 0; i < res.length; i++) {
            res[map.get(heights[i])] = names[i];
        }
        return res;
    }
}