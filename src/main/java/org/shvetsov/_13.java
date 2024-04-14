package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;

@LeetCode(
        number = 13,
        name = "Roman to Integer",
        level = Level.EASY,
        tags = {"Hash Table", "Math", "String"}
)
public class _13 {

    final static HashMap<Character, Integer> romanToInteger = new HashMap<>();

    static {
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);
    }


    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int prev = romanToInteger.get(chars[chars.length - 1]);
        int result = prev;
        int current;
        for (int i = chars.length - 2; i >= 0; i--) {
            current = romanToInteger.get(chars[i]);
            if (current < prev) {
                result -= current;
            } else result += current;
            prev = current;
        }
        return result;
    }
}