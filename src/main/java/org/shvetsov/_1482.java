package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1482,
        name = "Minimum Number of Days to Make m Bouquets",
        level = Level.MEDIUM,
        tags = {"Array", "Binary Search"}
)
public class _1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) return -1;
        //find min, max days of bloomDay array
        int min = bloomDay[0], max = bloomDay[0];
        for (int day : bloomDay) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }
        int result = -1;
        while (min <= max) {
            int mid = (max + min) / 2;
            int strick = 0;
            int coverBouquets = 0;
            //check if mid day enough to make m bouquets
            for (int day : bloomDay) {
                if (day <= mid) {
                    strick++;
                } else {
                    coverBouquets += strick / k;
                    strick = 0;
                }
            }
            coverBouquets += strick / k;
            //if mid day enough -> max = mid, else min = mid + 1
            if (coverBouquets >= m) {
                result = mid;
                max = mid;
                if (max == min) break;
            } else {
                min = mid + 1;
            }
        }
        return result;
    }
}