package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.math.BigDecimal;
import java.util.*;

@LeetCode(
        number = 1072,
        name = "Flip Columns For Maximum Number of Equal Rows",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Matrix"}
)
public class _1072 {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        BitSet[] bsMatrix = new BitSet[matrix.length];
        BitSet zeros = new BitSet(matrix[0].length);
        BitSet ones = new BitSet(matrix[0].length);
        ones.set(0, matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            bsMatrix[i] = new BitSet(row.length);
            for (int j = 0; j < row.length; j++) {
                if (matrix[i][j] == 1) {
                    bsMatrix[i].set(j);
                }
            }
        }
        int result = 0;
        Set<Integer> counted = new HashSet<>();
        for (int i = 0; i < bsMatrix.length; i++) {
            int count = 1;
            counted.add(i);
            for (int j = i + 1; j < bsMatrix.length; j++) {
                bsMatrix[i].xor(bsMatrix[j]);
                if (bsMatrix[i].equals(zeros) || bsMatrix[i].equals(ones)) {
                    counted.add(j);
                    count++;
                }
                bsMatrix[i].xor(bsMatrix[j]);
            }
            result = Math.max(result, count);
        }
        return result;
    }
}