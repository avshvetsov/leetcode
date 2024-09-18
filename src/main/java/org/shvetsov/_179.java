package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.List;

@LeetCode(
        number = 179,
        name = "Largest Number",
        level = Level.MEDIUM,
        tags = {"Array", "String", "Greedy", "Sorting"}
)
public class _179 {
    public String largestNumber(int[] nums) {
        String result = Arrays.stream(nums)
                .boxed()
                .sorted((i1, i2) -> compareIntAsString(Integer.toString(i2), Integer.toString(i2), Integer.toString(i1), Integer.toString(i1)))
                .reduce(new StringBuilder(), StringBuilder::append, StringBuilder::append).toString();
        if (result.startsWith("0")) {
            return "0";
        } else return result;
    }

    private int compareIntAsString(String s1, String default1, String s2, String default2) {
        if (s1.equals(s2)) return 0;
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        if (c1 == c2) {
            return compareIntAsString(s1.length() > 1 ? s1.substring(1) : default2, default1, s2.length() > 1 ? s2.substring(1) : default1, default2);
        } else return c1 - c2;
    }
}