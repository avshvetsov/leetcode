package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 860,
        name = "Lemonade Change",
        level = Level.EASY,
        tags = {"Array", "Greedy"}
)
public class _860 {
    public boolean lemonadeChange(int[] bills) {
        int[] cash = new int[3];
        for (int bill : bills) {
            switch (bill) {
                case 5 -> cash[0]++;
                case 10 -> {
                    if (cash[0] > 0) {
                        cash[0]--;
                        cash[1]++;
                    } else return false;
                }
                case 20 -> {
                    if (cash[1] > 0 && cash[0] > 0) {
                        cash[0]--;
                        cash[1]--;
                        cash[2]++;
                    } else if (cash[0] >= 3) {
                        cash[0] -= 3;
                        cash[2]++;
                    } else return false;
                }
                default -> {
                    return false;
                }
            }
        }
        return true;
    }
}