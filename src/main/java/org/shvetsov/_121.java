package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 121,
        name = "Best Time to Buy and Sell Stock",
        level = Level.EASY,
        tags = {"Array", "Dynamic Programming"}
)
public class _121 {

    public int maxProfit(int[] prices) {
        int max = 0;
        int i = 0;
        for (int j = 1; j < prices.length; j++) {
            if (prices[j] < prices[i]) {
                i = j;
                continue;
            }
            max = Math.max(max, prices[j] - prices[i]);
        }
        return max;
    }


    public int maxProfit2(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                max = Math.max(max, prices[j] - prices[i]);
            }
        }
        return max;
    }
}
