package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1442,
        name = "Count Triplets That Can Form Two Arrays of Equal XOR",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Math", "Bit Manipulation", "Prefix Sum"}
)
public class _1442 {

    public int countTriplets(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int xor = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                xor ^= arr[j];
                if (xor == 0) {
                    result += j - i;
                }
            }
        }
        return result;
    }
}