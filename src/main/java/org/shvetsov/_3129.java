package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3129,
        name = "Find All Possible Stable Binary Arrays I",
        level = Level.MEDIUM,
        tags = {}
)
public class _3129 {
    int lim = 0;
    int[][][][] cache = new int[][][][]{};

    public int numberOfStableArrays(int zero, int one, int limit) {
        lim = limit;
        long res = 0;
        int[][][][] cache = new int[zero + 1][one + 1][limit + 1][2];
        for (int i = 0; i <= zero; i++) {
            for (int j = 0; j <= one; j++) {
                for (int l = 0; l <= limit; l++) {
                    cache[i][j][l][0] = -1;
                    cache[i][j][l][1] = -1;
                }
            }
        }
        this.cache = cache;
        res += countHelper(zero - 1, one, limit - 1, 0);
        res += countHelper(zero, one - 1, limit - 1, 1);
        return (int) res % 1000000007;
    }

    private int countHelper(int zero, int one, int limit, int last) {
        if (cache[zero][one][limit][last] != -1) {
            return cache[zero][one][limit][last];
        }
        if (zero == 0 && one == 0) {
            return 1;
        }
        long zeroRes = 0;
        long oneRes = 0;

        if (zero > 0) {
            if (last == 0 && limit > 0) {
                zeroRes = countHelper(zero - 1, one, limit - 1, 0);
            } else if (last == 1) {
                zeroRes = countHelper(zero - 1, one, lim - 1, 0);
            }
        }
        if (one > 0) {
            if (last == 1 && limit > 0) {
                oneRes = countHelper(zero, one - 1, limit - 1, 1);
            } else if (last == 0) {
                oneRes = countHelper(zero, one - 1, lim - 1, 1);
            }
        }
        cache[zero][one][limit][last] = (int) (zeroRes + oneRes) % 1000000007;
        return (int) (zeroRes + oneRes) % 1000000007;
    }
}