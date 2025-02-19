package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 1415,
        name = "The k-th Lexicographical String of All Happy Strings of Length n",
        level = Level.MEDIUM,
        tags = {"String", "Backtracking"}
)
public class _1415 {
    public String getHappyString(int n, int k) {
        List<String> happy = new ArrayList<>();
        char[] chars = new char[]{'a', 'b', 'c'};
        String kthHappyString = getKthHappyString(new StringBuilder(), happy, chars, n, k);
        return kthHappyString == null ? "" : kthHappyString;
    }

    private String getKthHappyString(StringBuilder current, List<String> happy, char[] chars, int n, int k) {
        if (current.length() == n) {
            happy.add(current.toString());
            if (happy.size() == k) {
                return current.toString();
            } else {
                return null;
            }
        }
        for (char c : chars) {
            if (current.isEmpty() || current.charAt(current.length() - 1) != c) {
                current.append(c);
                String kthHappyString = getKthHappyString(current, happy, chars, n, k);
                if (kthHappyString != null) {
                    return kthHappyString;
                }
                current.deleteCharAt(current.length() - 1);
            }
        }
        return null;
    }
}