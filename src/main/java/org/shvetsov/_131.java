package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@LeetCode(
        number = 131,
        name = "Palindrome Partitioning",
        level = Level.MEDIUM,
        tags = {"String", "Dynamic Programming", "Backtracking"}
)
public class _131 {

    private final Map<Integer, List<String>> palindromes = new HashMap<>();

    public List<List<String>> partition(String s) {
        int n = s.length();
        //find all palindromes
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String curr = s.substring(i, j + 1);
                if (checkIsPalindrome(curr)) {
                    palindromes.computeIfAbsent(i, k -> new ArrayList<>()).add(curr);
                }
            }
        }
        //build partitions
        List<List<String>> result = new ArrayList<>();
        buildPartitionsHelper(0, new ArrayList<>(), result);
        return result;
    }

    private void buildPartitionsHelper(int start, List<String> partition, List<List<String>> result) {
        if (this.palindromes.containsKey(start)) {
            List<String> palindromes = this.palindromes.get(start);
            for (String palindrome : palindromes) {
                //backtracking approach
                partition.add(palindrome);
                buildPartitionsHelper(start + palindrome.length(), partition, result);
                partition.removeLast();

                //immutable approach
/*
                List<String> newPartition = new ArrayList<>(partition) {{
                    add(palindrome);
                }};
                buildPartitionsHelper(start + palindrome.length(), newPartition, result);
*/
            }
        } else result.add(new ArrayList<>(partition));

    }

    private boolean checkIsPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (r - l > 0) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

}