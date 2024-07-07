package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2582,
        name = "Pass the Pillow",
        level = Level.EASY,
        tags = {"Math", "Simulation"}
)
public class _2582 {
    public int passThePillow(int n, int time) {
        return time / (n - 1) % 2 == 0 ? 1 + time % (n - 1) : n - time % (n - 1);
    }
}