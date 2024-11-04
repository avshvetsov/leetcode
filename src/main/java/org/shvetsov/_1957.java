package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1957,
        name = "Delete Characters to Make Fancy String",
        level = Level.EASY,
        tags = {"String"}
)
public class _1957 {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        char lastChar = ' ';
        for (char c : s.toCharArray()) {
            if (c == lastChar) {
                cnt++;
            } else {
                cnt = 1;
                lastChar = c;
            }
            if (cnt < 3) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}