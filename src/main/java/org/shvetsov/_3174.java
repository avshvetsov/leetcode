package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Stack;
import java.util.stream.Collectors;

@LeetCode(
        number = 3174,
        name = "Clear Digits",
        level = Level.EASY,
        tags = {"String", "Stack", "Simulation"}
)
public class _3174 {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.stream().map(Object::toString).collect(Collectors.joining());
        //other way to do the same
//        StringBuilder sb = new StringBuilder();
//        while (!stack.isEmpty()) {
//            sb.append(stack.pop());
//        }
//        return sb.reverse().toString();
    }
}