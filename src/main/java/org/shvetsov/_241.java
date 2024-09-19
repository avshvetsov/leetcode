package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 241,
        name = "Different Ways to Add Parentheses",
        level = Level.MEDIUM,
        tags = {"Math", "String", "Dynamic Programming", "Recursion", "Memoization"}
)
public class _241 {
    private final Map<String, List<Integer>> map = new HashMap<>();

    public List<Integer> diffWaysToCompute(String expression) {
        if (expression == null || expression.isEmpty()) return Collections.emptyList();
        if (expression.length() <= 2) return List.of(Integer.parseInt(expression));

        if (map.containsKey(expression)) return map.get(expression);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            if (Character.isDigit(expression.charAt(i))) continue;
            char operator = expression.charAt(i);
            List<Integer> left = diffWaysToCompute(expression.substring(0, i));
            List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
            for (Integer leftVal : left) {
                for (Integer rightVal : right) {
                    switch (operator) {
                        case '+' -> result.add(leftVal + rightVal);
                        case '-' -> result.add(leftVal - rightVal);
                        case '*' -> result.add(leftVal * rightVal);
                    }
                }
            }
        }
        map.put(expression, result);
        return result;
    }
}