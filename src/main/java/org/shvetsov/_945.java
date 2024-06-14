package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 945,
        name = "Minimum Increment to Make Array Unique",
        level = Level.MEDIUM,
        tags = {"Array", "Greedy", "Sorting", "Counting"}
)
public class _945 {

    public int minIncrementForUnique(int[] nums) {
        int result = 0;
        //Find max value
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        //Count frequency
        int[] cnt = new int[max + 1];
        for (int num : nums) {
            cnt[num]++;
        }
        int free = 0;
        for (int i = 0; i < cnt.length; i++) {
            free = Math.max(free, i);
            while (cnt[i] > 1) {
                //Find first free num from last filled free
                free = getFirstFree(cnt, free);
                if (free < cnt.length) {
                    cnt[free]++;
                }
                result += free - i;
                cnt[i]--;
            }
        }
        return result;
    }

    private int getFirstFree(int[] cnt, int start) {
        int i;
        for (i = start; i < cnt.length; i++) {
            if (cnt[i] == 0) {
                return i;
            }
        }
        return Math.max(i, start + 1);
    }

}