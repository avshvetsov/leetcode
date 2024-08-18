package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.List;

@LeetCode(
        number = 624,
        name = "Maximum Distance in Arrays",
        level = Level.MEDIUM,
        tags = {"Array", "Greedy"}
)
public class _624 {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.getFirst().getFirst();
        int max = arrays.getFirst().getLast();
        int distance = 0;
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            distance = Math.max(distance, Math.max(max - array.getFirst(), array.getLast() - min));
            min = Math.min(min, array.getFirst());
            max = Math.max(max, array.getLast());
        }
        return distance;
    }

}