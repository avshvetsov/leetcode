package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 1051,
        name = "Height Checker",
        level = Level.EASY,
        tags = {"Array", "Sorting", "Counting Sort"}
)
public class _1051 {

    static final int MIN = 1;
    static final int MAX = 100;

    public int heightChecker(int[] heights) {
        int result = 0;
        int[] expected = Arrays.copyOf(heights, heights.length);
//        Arrays.sort(expected);
        countingSort(expected);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                result++;
            }
        }
        return result;
    }

    public void countingSort(int[] arr) {
        int[] map = new int[MAX - MIN + 1];
        for (int i : arr) {
            map[i - MIN]++;
        }
        int j = 0;
        for (int i = 0; i < map.length; i++) {
            while (map[i] > 0) {
                arr[j++] = i + MIN;
                map[i]--;
            }
        }
    }

    public void countingSortMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int j = 0;
        for (int i = MIN; i <= MAX; i++) {
            for (int k = 0; k < map.getOrDefault(i, 0); k++) {
                arr[j++] = i;
            }
        }
    }
}