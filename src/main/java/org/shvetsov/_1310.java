package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1310,
        name = "XOR Queries of a Subarray",
        level = Level.MEDIUM,
        tags = {"Array", "Bit Manipulation", "Prefix Sum"}
)
public class _1310 {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixXor = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            prefixXor[i + 1] = prefixXor[i] ^ arr[i];
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = prefixXor[queries[i][0]] ^ prefixXor[queries[i][1] + 1];
        }
        return result;
    }


    public int[] xorQueriesMLE(int[] arr, int[][] queries) {
        int[][] prefixXor = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            prefixXor[i][i] = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                prefixXor[i][j] = prefixXor[i][j - 1] ^ arr[j];
            }
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = prefixXor[queries[i][0]][queries[i][1]];
        }
        return result;
    }
}