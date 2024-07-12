package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;
import java.util.Stack;

@LeetCode(
        number = 1717,
        name = "Maximum Score From Removing Substrings",
        level = Level.MEDIUM,
        tags = {"String", "Stack", "Greedy"}
)
public class _1717 {

    private final char[] order = new char[2];

    public int maximumGain(String s, int x, int y) {
        String[] split = s.split("[c-z.]");
        int natural = 0;
        int reverse = 0;
        if (x >= y) {
            order[0] = 'a';
            order[1] = 'b';
            natural = x;
            reverse = y;
        } else {
            order[0] = 'b';
            order[1] = 'a';
            natural = y;
            reverse = x;
        }
        int res = 0;
        for (String string : split) {
            res += countPoints(string, natural, reverse);
        }
        return res;
    }

    private int countPoints(String s, int natural, int reverse) {
        int res = 0;
        Stack<Character> stackNatural = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stackNatural.isEmpty() && stackNatural.peek() == order[0] && c == order[1]) {
                stackNatural.pop();
                res += natural;
            } else {
                stackNatural.push(c);
            }
        }
        Stack<Character> stackReverse = new Stack<>();
        while (!stackNatural.isEmpty()) {
            if (!stackReverse.isEmpty() && stackReverse.peek() == order[0] && stackNatural.peek() == order[1]) {
                stackReverse.pop();
                stackNatural.pop();
                res += reverse;
            } else {
                stackReverse.push(stackNatural.pop());
            }
        }
        return res;
    }
}