package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 678,
        name = "Valid Parenthesis String",
        level = Level.MEDIUM,
        tags = {"String", "Dynamic Programming", "Stack", "Greedy"}
)
public class _678 {
    public boolean checkValidString(String s) {
        char[] chars = s.toCharArray();
        int countL = 0;
        int countS = 0;
        int countR = 0;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(' -> countL++;
                case '*' -> countS++;
                case ')' -> {
                    if (countL + countS == 0) {
                        return false;
                    } else {
                        if (countL > 0) {
                            countL--;
                        } else {
                            countS--;
                        }
                    }
                }
                default -> throw new IllegalArgumentException();
            }
        }

        countL = 0;
        countS = 0;
        countR = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            switch (chars[i]) {
                case '(' -> {
                    if (countR + countS == 0) {
                        return false;
                    } else {
                        if (countR > 0) {
                            countR--;
                        } else {
                            countS--;
                        }
                    }
                }
                case '*' -> countS++;
                case ')' -> countR++;
                default -> throw new IllegalArgumentException();
            }
        }
        return true;
    }
}