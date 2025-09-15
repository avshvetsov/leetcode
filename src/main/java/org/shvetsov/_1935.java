package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Set;
import java.util.stream.Collectors;

@LeetCode(
        number = 1935,
        name = "Maximum Number of Words You Can Type",
        level = Level.EASY,
        tags = {"Hash Table", "String", "Weekly Contest 250"}
)
public class _1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        Set<Integer> broken = brokenLetters.chars().boxed().collect(Collectors.toSet());
        for (String word : text.split(" ")) {
            if (word.chars()
                    .noneMatch(broken::contains)) {
                count++;
            }
        }
        return count;
    }
}