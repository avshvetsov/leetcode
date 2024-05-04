package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 881,
        name = "Boats to Save People",
        level = Level.MEDIUM,
        tags = {"Array", "Two Pointers", "Greedy", "Sorting"}
)
public class _881 {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0, r = people.length - 1;
        int res = 0;
        while (l <= r) {
            int curr = 0;
            int currCnt = 0;
            while (l <= r  && currCnt < 2 && curr + people[r] <= limit) {
                curr += people[r];
                currCnt++;
                r--;
            }
            while (l <= r && currCnt < 2 && curr + people[l] <= limit) {
                curr += people[l];
                currCnt++;
                l++;
            }
            res++;
        }
        return res;
    }
}