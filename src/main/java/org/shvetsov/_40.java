package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@LeetCode(
        number = 40,
        name = "Combination Sum II",
        level = Level.MEDIUM,
        tags = {"Array", "Backtracking"}
)
public class _40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int[] freq = new int[target + 1];
        for (int i : candidates) {
            if (i < target + 1) {
                freq[i]++;
            }
        }
        helper(freq, target, new ArrayList<>(), result);
        return result.stream().distinct().collect(Collectors.toList());
    }

    private void helper(int[] freq, int target, List<Integer> current, List<List<Integer>> result) {
        if (target < 0) return;
        else if (target == 0) {
            ArrayList<Integer> e = new ArrayList<>(current);
            e.sort(Integer::compareTo);
            result.add(e);
            return;
        }

        for (int i = target; i >= 0; i--) {
            if (freq[i] > 0) {
                freq[i]--;
                current.add(i);
                helper(freq, target - i, current, result);
                current.removeLast();
                freq[i]++;
            }
        }
    }

    public static class NoFreq {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(candidates);
            backtracking(candidates, 0, target, new ArrayList<>(), result);
            return result;
        }

        private void backtracking(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
            }
            for (int i = index; i < candidates.length && target >= candidates[i]; i++) {
                if (i != index && candidates[i] == candidates[i - 1]) continue;
                current.add(candidates[i]);
                backtracking(candidates, i + 1, target - candidates[i], current, result);
                current.removeLast();
            }
        }
    }
}