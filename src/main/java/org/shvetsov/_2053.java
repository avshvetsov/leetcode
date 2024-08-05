package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@LeetCode(
        number = 2053,
        name = "Kth Distinct String in an Array",
        level = Level.EASY,
        tags = {"Array", "Hash Table", "String", "Counting"}
)
public class _2053 {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Long> map = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (String s : arr) {
            if (map.get(s) == 1) {
                k--;
                if (k == 0) {
                    return s;
                }
            }
        }
        return "";
    }
}