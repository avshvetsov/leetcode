package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 1395,
        name = "Count Number of Teams",
        level = Level.MEDIUM,
        tags = {"Array", "Dynamic Programming", "Binary Indexed Tree"}
)
public class _1395 {
    public int numTeams(int[] rating) {
        int result = 0;
        List<int[]> dp = new ArrayList<>();
        for (int i = 0; i < rating.length; i++) {
            int curr = rating[i];
            int more = 0;
            int less = 0;
            for (int[] ints : dp) {
                if (curr > ints[0]) {
                    result += ints[1];
                    more++;
                } else if (curr < ints[0]) {
                    result += ints[2];
                    less++;
                }
            }
            dp.add(new int[]{curr, more, less});
        }
        return result;
    }
}