package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3163,
        name = "String Compression III",
        level = Level.MEDIUM,
        tags = {"String"}
)
public class _3163 {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        char prev = word.charAt(0);
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == prev) {
                if (count < 9) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(prev);
                    count = 1;
                }
            } else {
                sb.append(count);
                sb.append(prev);
                prev = c;
                count = 1;
            }
        }
        sb.append(count);
        sb.append(prev);
        return sb.toString();
    }
}