package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3021,
        name = "Alice and Bob Playing Flower Game",
        level = Level.MEDIUM,
        tags = {"Math", "Weekly Contest 382"}
)
public class _3021 {
    public long flowerGame(int n, int m) {
        long evenn = n / 2, evenm = m / 2;
        long oddn = n - evenn, oddm = m - evenm;
        return oddn * evenm + oddm * evenn;
    }
}