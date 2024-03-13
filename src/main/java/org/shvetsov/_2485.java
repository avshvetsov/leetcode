package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2485,
        name = "Find the Pivot Integer",
        level = Level.EASY,
        tags = {"Math", "Prefix Sum"}
)
public class _2485 {

    public int pivotInteger(int n) {
        int l = 1;
        int lsum = l;
        int r = n;
        int rsum = r;
        while (l != r) {
            if (lsum < rsum) {
                l++;
                lsum += l;
            } else {
                r--;
                rsum += r;
            }
        }
        return lsum == rsum ? l : -1;
    }

}