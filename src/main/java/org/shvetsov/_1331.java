package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 1331,
        name = "Rank Transform of an Array",
        level = Level.EASY,
        tags = {"Array", "Hash Table", "Sorting"}
)
public class _1331 {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] sortedSet = Arrays.stream(arr).sorted().distinct().toArray();
        for (int i = 0; i < sortedSet.length; i++) {
            map.put(sortedSet[i], i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }

    public static class NotOptimal {
        public int[] arrayRankTransform(int[] arr) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
            }
            int[] res = new int[arr.length];
            Arrays.sort(arr);
            int rank = 1;
            Integer val = null;
            for (int i = 0; i < arr.length; i++) {
                if (val != null && arr[i] == val) continue;
                val = arr[i];
                List<Integer> poss = map.get(val);
                for (Integer pos : poss) {
                    res[pos] = rank;
                }

                rank++;
            }
            return res;
        }
    }
}