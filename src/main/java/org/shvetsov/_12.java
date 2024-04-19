package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;

@LeetCode(
        number = 12,
        name = "Integer to Roman",
        level = Level.MEDIUM,
        tags = {"Hash Table", "Math", "String"}
)
public class _12 {
    final static HashMap<Integer, Character[]> romanToInteger = new HashMap<>();
    final static HashMap<Integer, Integer[]> pattern = new HashMap<>();

    static {
        romanToInteger.put(1, new Character[]{'I', 'V', 'X'});
        romanToInteger.put(2, new Character[]{'X', 'L', 'C'});
        romanToInteger.put(3, new Character[]{'C', 'D', 'M'});
        romanToInteger.put(4, new Character[]{'M', 'M', 'M'});

        pattern.put(0, new Integer[]{});
        pattern.put(1, new Integer[]{0});
        pattern.put(2, new Integer[]{0, 0});
        pattern.put(3, new Integer[]{0, 0, 0});
        pattern.put(4, new Integer[]{0, 1});
        pattern.put(5, new Integer[]{1});
        pattern.put(6, new Integer[]{1, 0});
        pattern.put(7, new Integer[]{1, 0, 0});
        pattern.put(8, new Integer[]{1, 0, 0, 0});
        pattern.put(9, new Integer[]{0, 2});
    }

    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        int divider = 10;
        int patternNum = 1;
        do {
            StringBuilder tmp = new StringBuilder();
            int rest = num % divider;
            for (Integer i : pattern.get(rest)) {
                tmp.append(romanToInteger.get(patternNum)[i]);
            }
            res.insert(0, tmp);
            num /= 10;
            patternNum++;
        } while (num > 0);
        return res.toString();
    }
}