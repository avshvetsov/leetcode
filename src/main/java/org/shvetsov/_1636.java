package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@LeetCode(
        number = 1636,
        name = "Sort Array by Increasing Frequency",
        level = Level.EASY,
        tags = {"Array", "Hash Table", "Sorting"}
)
public class _1636 {

    public int[] frequencySort(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().sorted((e1, e2) -> {
                    if (!e1.getValue().equals(e2.getValue())) {
                        return e1.getValue().compareTo(e2.getValue());
                    } else {
                        return e2.getKey().compareTo(e1.getKey());
                    }
                })
                .flatMapToInt(entry -> IntStream.generate(entry::getKey).limit(entry.getValue()))
                .toArray();
    }
}