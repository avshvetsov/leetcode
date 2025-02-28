package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1092,
        name = "Shortest Common Supersequence",
        level = Level.HARD,
        tags = {"String", "Dynamic Programming"}
)
public class _1092 {
    public String shortestCommonSupersequence(String str1, String str2) {
        //Saving full 2D array produce 'Memory limit exceeded'
        //dp saves info about shortest supersequence for str1.substring(0, row) and str2.substring(0, col)
        String[] prevRow = new String[str2.length() + 1];
        for (int i = 0; i < prevRow.length; i++) {
            prevRow[i] = str2.substring(0, i);
        }

        String[] currRow = null;
        for (int r = 1; r <= str1.length(); r++) {
            currRow = new String[str2.length() + 1];
            currRow[0] = str1.substring(0, r);
            for (int c = 1; c <= str2.length(); c++) {
                //Якщо символи на r в str1 та c в str2 - співпадають, то до dp[r-1][c-1] додаємо поточний символ
                if (str1.charAt(r - 1) == str2.charAt(c - 1)) {
                    currRow[c] = prevRow[c - 1] + str1.charAt(r - 1);
                }
                //Якщо символи на r в str1 та c в str2 - відрізняються, то до найменшого з dp[r-1][c] та dp[r][c-1]
                //додаємо недістаючий символ (str1.charAt(r - 1) та str2.charAt(c - 1) відповідно)
                else {
                    currRow[c] = prevRow[c].length() < currRow[c - 1].length()
                            ? prevRow[c] + str1.charAt(r - 1)
                            : currRow[c - 1] + str2.charAt(c - 1);
                }
            }
            prevRow = currRow;
        }
        return currRow[str2.length()];
    }
}