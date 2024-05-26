package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@LeetCode(
        number = 140,
        name = "Word Break II",
        level = Level.HARD,
        tags = {"Array", "Hash Table", "String", "Dynamic Programming", "Backtracking", "Trie", "Memoization"}
)
public class _140 {

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        Map<Character, List<String>> dict = wordDict.stream()
                .collect(Collectors.groupingBy(s1 -> s1.charAt(0), Collectors.toList()));
        wordBreakHelper(s, dict, 0, new StringBuilder(), result);
        return result;
    }

    private void wordBreakHelper(String word, Map<Character, List<String>> dict, int start, StringBuilder sb, List<String> result) {

        if (start == word.length()) {
            result.add(sb.toString().trim());
            return;
        }
        String leftWord = word.substring(start);
        if (!dict.containsKey(word.charAt(start))) return;
        for (String dictWord : dict.get(word.charAt(start))) {
            if (leftWord.startsWith(dictWord)) {
                //immutable approach
//                StringBuilder newSB = new StringBuilder(sb);
//                newSB.append(" ").append(dictWord);
//                wordBreakHelper(word, dict, start + dictWord.length(), newSB, result);
                //backtracking approach
                sb.append(" ").append(dictWord);
                wordBreakHelper(word, dict, start + dictWord.length(), sb, result);
                sb.delete(sb.lastIndexOf(" "), sb.length());
            }
        }
    }
}