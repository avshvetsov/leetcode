package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@LeetCode(
        number = 726,
        name = "Number of Atoms",
        level = Level.HARD,
        tags = {"Hash Table", "String", "Stack", "Sorting"}
)
public class _726 {
    public String countOfAtoms(String formula) {
        Map<String, Integer> elementMap = parseFormula(formula);
        return elementMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + (entry.getValue() != 1 ? String.valueOf(entry.getValue()) : ""))
                .collect(Collectors.joining());
    }

    private Map<String, Integer> parseFormula(String formula) {
        Map<String, Integer> elementMap = new HashMap<>();
        int i = 0;
        while (i < formula.length()) {
            char c = formula.charAt(i);
            if (Character.isUpperCase(c)) {
                String element = getElement(formula, i);
                i += element.length();
                Integer count = getCount(formula, i);
                if (count != 1) {
                    i += String.valueOf(count).length();
                }
                elementMap.put(element, elementMap.getOrDefault(element, 0) + count);
            } else if (c == '(') {
                int endIndex = getCloseBracketIndex(formula, i);
                Map<String, Integer> elements = parseFormula(formula.substring(i + 1, endIndex));
                i = endIndex + 1;
                Integer count = getCount(formula, i);
                if (count != 1) {
                    i += String.valueOf(count).length();
                }
                for (Map.Entry<String, Integer> entry : elements.entrySet()) {
                    elementMap.merge(entry.getKey(), entry.getValue() * count, Integer::sum);
                }
            }
        }
        return elementMap;
    }

    private int getCloseBracketIndex(String formula, int i) {
        int cnt = 0;
        do {
            switch (formula.charAt(i)) {
                case '(' -> cnt++;
                case ')' -> cnt--;
            }
            i++;
        } while (cnt != 0);
        return i - 1;
    }

    private Integer getCount(String formula, int start) {
        StringBuilder sb = new StringBuilder();
        while (start < formula.length() && Character.isDigit(formula.charAt(start))) {
            sb.append(formula.charAt(start));
            start++;
        }
        String count = sb.toString();
        return count.isEmpty() ? 1 : Integer.parseInt(count);
    }

    private String getElement(String formula, int start) {
        int end = start + 1;
        while (end < formula.length() && !Character.isDigit(formula.charAt(end)) && formula.charAt(end) != '(' && !Character.isUpperCase(formula.charAt(end))) {
            end++;
        }
        return formula.substring(start, end);
    }
}