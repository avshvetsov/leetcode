package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@LeetCode(
        number = 1718,
        name = "Construct the Lexicographically Largest Valid Sequence",
        level = Level.MEDIUM,
        tags = {"Array", "Backtracking"}
)
public class _1718 {
    public int[] constructDistancedSequence(int n) {
        List<Integer> possibleIntegers = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            possibleIntegers.add(i);
        }
        int[] res = new int[n * 2 - 1];
        populateArray(res, possibleIntegers);
        return res;
    }

    private boolean populateArray(int[] arr, List<Integer> possibleIntegers) {
        if (possibleIntegers.isEmpty()) {
            return true;
        }
        for (int i = 0; i < possibleIntegers.size(); i++) {
            Integer curr = possibleIntegers.remove(i);
            List<Integer> indexes = canAddIntoArray(arr, curr);
            if (!indexes.isEmpty()) {
                for (Integer index : indexes) {
                    arr[index] = curr;
                }
                if (populateArray(arr, possibleIntegers)) {
                    return true;
                }
                for (Integer index : indexes) {
                    arr[index] = 0;
                }
            }
            possibleIntegers.add(curr);
            possibleIntegers.sort(Comparator.reverseOrder());
        }
        return false;
    }

    private List<Integer> canAddIntoArray(int[] arr, Integer curr) {
        int i = 0;
        while (arr[i] != 0) {
            i++;
        }
        List<Integer> res = new ArrayList<>();
        if (curr == 1) {
            res.add(i);
        } else if (i + curr < arr.length && arr[i + curr] == 0) {
            res.add(i);
            res.add(i + curr);
        }
        return res;
    }
}