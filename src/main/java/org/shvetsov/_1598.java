package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1598,
        name = "Crawler Log Folder",
        level = Level.EASY,
        tags = {"Array", "String", "Stack"}
)
public class _1598 {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            switch (log) {
                case "../" -> depth = Math.max(0, depth - 1);
                case "./" -> {}
                default -> depth++;
            }
        }
        return depth;
    }
}