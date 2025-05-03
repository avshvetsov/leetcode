package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 1007,
        name = "Minimum Domino Rotations For Equal Row",
        level = Level.MEDIUM,
        tags = {"Array", "Greedy"}
)
public class _1007 {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        Map<Integer, int[]> options = new HashMap<>();
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] == bottoms[i]) {
                options.computeIfAbsent(tops[i], integer -> new int[3])[2]++;
            } else {
                options.computeIfAbsent(tops[i], integer -> new int[3])[0]++;
                options.computeIfAbsent(bottoms[i], integer -> new int[3])[1]++;
            }
        }
        for (Map.Entry<Integer, int[]> entry : options.entrySet()) {
            if (entry.getValue()[0] + entry.getValue()[1] + entry.getValue()[2] >= tops.length) {
                return Math.min(entry.getValue()[0], entry.getValue()[1]);
            }
        }
        return -1;
    }
}