package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 1524,
        name = "Number of Sub-arrays With Odd Sum",
        level = Level.MEDIUM,
        tags = {"Array", "Math", "Dynamic Programming", "Prefix Sum"}
)
public class _1524 {
    public int numOfSubarrays(int[] arr) {
        long[] prefix = new long[arr.length];
        long[] oddEvenLast = new long[2];
        int nextOddIsEven = 0;
        int even = 0;
        if (arr[0] % 2 != 0) {
            prefix[0] = 1;
            oddEvenLast[0] = 1;
            nextOddIsEven = 1;
        } else {
            even++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                prefix[i] = prefix[i - 1];
                even++;
            } else {
                prefix[i] = even + 1 + oddEvenLast[nextOddIsEven];
                oddEvenLast[nextOddIsEven] = prefix[i];
                even = 0;
                nextOddIsEven = (nextOddIsEven + 1) % 2;
            }
        }

        return (int) (Arrays.stream(prefix).sum() % 1_000_000_007);
    }
}