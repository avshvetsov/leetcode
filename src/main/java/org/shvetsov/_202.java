package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 202,
        name = "Happy Number",
        level = Level.EASY,
        tags = {"Hash Table", "Math", "Two Pointers"}
)
public class _202 {

    private final Set<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {
        if (set.contains(n)) {
            return false;
        }
        set.add(n);

        int sum = 0;
        while (n / 10 > 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        sum += n * n;
        if (sum == 1) {
            return true;
        }
        return isHappy(sum);
    }


}
