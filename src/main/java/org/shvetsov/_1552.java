package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 1552,
        name = "Magnetic Force Between Two Balls",
        level = Level.MEDIUM,
        tags = {"Array", "Binary Search", "Sorting"}
)
public class _1552 {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int minDistance = 1;
        int maxDistance = (position[position.length - 1] - position[0]) / (m - 1);
        int result = 1;
        while (minDistance < maxDistance) {
            int mid = (maxDistance + minDistance) / 2;
            if (isFit(position, m, mid)) {
                result = mid;
                minDistance = mid + 1;
            } else {
                maxDistance = mid;
            }
        }

        int mid = (maxDistance + minDistance) / 2;
        if (isFit(position, m, mid)) {
            return mid;
        } else {
            return result;
        }
    }

    private boolean isFit(int[] position, int m, int dist) {
        int i = 0;
        int basket = position[0];
        while (m > 0 && i < position.length) {
            if (basket > position[i]) {
                i++;
            } else {
                m--;
                basket = position[i] + dist;
            }
        }
        if (m == 0) {
            return true;
        } else return false;
    }
}