package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Comparator;
import java.util.stream.IntStream;

@LeetCode(
        number = 2191,
        name = "Sort the Jumbled Numbers",
        level = Level.MEDIUM,
        tags = {"Array", "Sorting"}
)
public class _2191 {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        return IntStream.range(0, nums.length)
                .mapToObj(i -> new int[]{nums[i], i, transform(mapping, nums[i])})
                .sorted(Comparator
                        .comparing((int[] ints) -> ints[2])
                        .thenComparingInt((int[] ints) -> ints[1]))
                .mapToInt(ints -> ints[0])
                .toArray();
    }

    private int transform(int[] mapping, int num) {
        int result = 0;
        int p = 1;
        int left;
        do {
            left = num % 10;
            result += mapping[left] * p;
            num /= 10;
            p *= 10;
        } while (num > 0);
        return result;
    }
}