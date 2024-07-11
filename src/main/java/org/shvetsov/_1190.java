package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

@LeetCode(
        number = 1190,
        name = "Reverse Substrings Between Each Pair of Parentheses",
        level = Level.MEDIUM,
        tags = {"String", "Stack"}
)
public class _1190 {
    public String reverseParentheses(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ')') {
                stack.push(chars[i]);
            } else {
                Deque<Character> reversed = new LinkedList<>();
                Character popped = stack.pop();
                while (popped != '(') {
                    reversed.addLast(popped);
                    popped = stack.pop();
                }
                stack.addAll(reversed);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}