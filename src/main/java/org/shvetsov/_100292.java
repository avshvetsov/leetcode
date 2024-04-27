package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 100292,
        name = "Find All Possible Stable Binary Arrays I",
        level = Level.MEDIUM,
        tags = {}
)
public class _100292 {
    int lim = 0;
    public int numberOfStableArrays(int zero, int one, int limit) {
        lim = limit;
        long res = countHelper(zero, one, limit, 0);

        return (int) res % 1000000007;
    }

    private long countHelper(int zero, int one, int limit, int last) {
        long zeroRes = 0;
        long oneRes = 0;
        if (zero == 0) {
            if (one <= limit) return 1;
            else return 0;
        } else if (zero > 0) {
            if (last == 0 && limit > 0) {
                zeroRes = countHelper(zero - 1, one, limit - 1, 0);
            } else if (last == 1) {
                zeroRes = countHelper(zero - 1, one, lim - 1, 0);
            } else if (limit == 0) {
                zeroRes = 0;
            }
        }
        if (one == 0) {
            if (zero <= limit) return 1;
            else return 0;
        } else if (one > 0) {
            if (last == 1 && limit > 0) {
                oneRes = countHelper(zero, one - 1, limit - 1, 1);
            } else if (last == 0) {
                oneRes = countHelper(zero, one - 1, lim - 1, 1);
            } else if (limit == 0) {
                oneRes = 0;
            }
        }
        if (zeroRes > 0 && oneRes > 0) {
            return zeroRes + oneRes;
        } else if (zero > 0) {
            return zero;
        } else if (one > 0) {
            return oneRes;
        }
        return 0;
    }
}