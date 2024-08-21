package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 664,
        name = "Strange Printer",
        level = Level.MEDIUM,
        tags = {"String", "Dynamic Programming"}
)
public class _664 {

    public int strangePrinter(String s) {
        String deduplicated = removeDuplicates(s);
        Map<String, Integer> dp = new HashMap<>() {{
            put("", 0);
        }};
        return count(deduplicated, dp);
    }

    private int count(String s, Map<String, Integer> dp) {
        if (dp.containsKey(s)) return dp.get(s);

        char firstChar = s.charAt(0);
        //if first char contains only ones, we calculate count() from second char and add 1
        int res = 1 + count(s.substring(1), dp);
        //if first char contains several times, we calculate result with each pair and get best
        int j = s.indexOf(firstChar, 1);
        while (j != -1) {
            //calculate result between pair of the same char
            int inner = count(s.substring(1, j), dp);
            //calculate result from right char of pair (included) to the end
            int outer = count(s.substring(j), dp);
            //find min result
            res = Math.min(res, inner + outer);
            //find position of next firstChar
            j = s.indexOf(firstChar, j + 1);
        }

        dp.put(s, res);
        return res;
    }

    private static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        char prev = '_';
        for (char c : s.toCharArray()) {
            if (c != prev) {
                sb.append(c);
            }
            prev = c;
        }
        return sb.toString();
    }
}