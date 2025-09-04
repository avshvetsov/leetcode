package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3516,
        name = "Find Closest Person",
        level = Level.EASY,
        tags = {"Math", "Weekly Contest 445"}
)
public class _3516 {
    public int findClosest(int x, int y, int z) {
        return Math.abs(z - x) < Math.abs(z - y) ? 1 : Math.abs(z - x) > Math.abs(z - y) ? 2 : 0;
    }
}