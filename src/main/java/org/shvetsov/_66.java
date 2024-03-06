package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 66,
        name = "Plus One",
        level = Level.EASY,
        tags = {"Array", "Math"}
)
public class _66 {

    public int[] plusOne(int[] digits) {
        boolean b = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            int j = digits[i] + 1;
            if (j < 10) {
                digits[i] = j;
                b = false;
                break;
            } else {
                digits[i] = j % 10;
            }
        }
        if (b) {
            int[] copy = new int[digits.length + 1];
            copy[0] = 1;
            System.arraycopy(digits, 0, copy, 1, digits.length);
            return copy;
        }
        return digits;
    }
}
