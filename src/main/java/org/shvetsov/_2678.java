package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 2678,
        name = "Number of Senior Citizens",
        level = Level.EASY,
        tags = {"Array", "String"}
)
public class _2678 {
    public int countSeniors(String[] details) {
        return (int) Arrays.stream(details)
                .mapToInt(s -> Integer.parseInt(s.substring(11, 13)))
                .filter(value -> value > 60)
                .count();
    }
}