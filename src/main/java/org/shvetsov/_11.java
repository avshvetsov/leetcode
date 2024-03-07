package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 11,
        name = "Container With Most Water",
        level = Level.MEDIUM,
        tags = {"Array", "Two Pointers", "Greedy"}
)
public class _11 {

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int a = 0;
        while (r > l) {
            a = Math.max(a, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else r--;
        }
        return a;
    }
}