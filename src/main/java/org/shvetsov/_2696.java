package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Stack;

@LeetCode(
        number = 2696,
        name = "Minimum String Length After Removing Substrings",
        level = Level.EASY,
        tags = {"String", "Stack", "Simulation"}
)
public class _2696 {
    public int minLength(String s) {
        int l;
        do {
            l = s.length();
            s = s.replace("AB", "");
            s = s.replace("CD", "");
        } while (l != s.length());
        return s.length();
    }

    public static class StackSolution {
        public int minLength(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.toCharArray().length; i++) {
                char curr = s.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(curr);
                } else if ((curr == 'B' && stack.peek() == 'A') || (curr == 'D' && stack.peek() == 'C')) {
                    stack.pop();
                } else {
                    stack.push(curr);
                }
            }
            return stack.size();
        }
    }
}