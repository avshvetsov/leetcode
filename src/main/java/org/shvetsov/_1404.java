package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@LeetCode(
        number = 1404,
        name = "Number of Steps to Reduce a Number in Binary Representation to One",
        level = Level.MEDIUM,
        tags = {"String", "Bit Manipulation"}
)
public class _1404 {
    public int numSteps(String s) {
        int res = 0;
        List<Character> chars = new LinkedList<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        while (chars.size() > 1) {
            if (chars.getLast() == '1') {
                int i = chars.size() - 1;
                while (i >= 0 && chars.get(i) == '1') {
                    chars.set(i, '0');
                    i--;
                }
                if (i >= 0) {
                    chars.set(i, '1');
                } else {
                    chars.addFirst('1');
                }
            } else chars.removeLast();
            res++;
        }
        return res;
    }
}