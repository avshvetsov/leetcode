package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Stack;
import java.util.stream.Collectors;

@LeetCode(
        number = 2375,
        name = "Construct Smallest Number From DI String",
        level = Level.MEDIUM,
        tags = {"String", "Backtracking", "Stack", "Greedy"}
)
public class _2375 {
    public String smallestNumber(String pattern) {
        boolean[] used = new boolean[11];
        Stack<Integer> stack = null;
        for (int i = 1; i < 10; i++) {
            stack = new Stack<>();
            used[i] = true;
            stack.push(i);
            if (getSmallestNumber(pattern, 0, used, stack)) break;
            stack.pop();
            used[i] = false;
        }
        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }

    private boolean getSmallestNumber(String pattern, int index, boolean[] used, Stack<Integer> stack) {
        if (index == pattern.length()) return true;
        char c = pattern.charAt(index);
        for (int i = c == 'I' ? stack.peek() + 1 : 1; i < (c == 'I' ? 10 : stack.peek()); i++) {
            if (used[i]) continue;
            used[i] = true;
            stack.push(i);
            if (getSmallestNumber(pattern, index + 1, used, stack)) {
                return true;
            }
            stack.pop();
            used[i] = false;
        }
        return false;
    }


    static class StringSolution {
        public String smallestNumber(String pattern) {
            boolean[] used = new boolean[11];
            for (int i = 1; i < 10; i++) {
                used[i] = true;
                String smallestNumber = getSmallestNumber(pattern, 0, used, i);
                if (smallestNumber != null) return i + smallestNumber;
                used[i] = false;
            }
            throw new IllegalArgumentException();
        }

        private String getSmallestNumber(String pattern, int index, boolean[] used, int prev) {
            if (index == pattern.length()) return "";
            char c = pattern.charAt(index);
            for (int i = c == 'I' ? prev + 1 : 1; i < (c == 'I' ? 10 : prev); i++) {
                if (used[i]) continue;
                used[i] = true;
                String smallestNumber = getSmallestNumber(pattern, index + 1, used, i);
                if (smallestNumber != null) return i + smallestNumber;
                used[i] = false;
            }
            return null;
        }
    }

    static class StackSolutionBottomUp {
        public String smallestNumber(String pattern) {
            boolean[] used = new boolean[11];
            for (int i = 1; i < 10; i++) {
                used[i] = true;
                Stack<Integer> smallestNumber = getSmallestNumber(pattern, 0, used, i);
                if (smallestNumber != null) {
                    smallestNumber.push(i);
                    return new StringBuilder(smallestNumber.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining())).reverse().toString();
                }
                used[i] = false;
            }
            throw new IllegalArgumentException();
        }

        private Stack<Integer> getSmallestNumber(String pattern, int index, boolean[] used, int prev) {
            if (index == pattern.length()) return new Stack<>();
            char c = pattern.charAt(index);
            for (int i = c == 'I' ? prev + 1 : 1; i < (c == 'I' ? 10 : prev); i++) {
                if (used[i]) continue;
                used[i] = true;
                Stack<Integer> smallestNumber = getSmallestNumber(pattern, index + 1, used, i);
                if (smallestNumber != null) {
                    smallestNumber.push(i);
                    return smallestNumber;
                }
                used[i] = false;
            }
            return null;
        }
    }
}