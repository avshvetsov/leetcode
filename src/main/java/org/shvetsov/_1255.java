package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 1255,
        name = "Maximum Score Words Formed by Letters",
        level = Level.HARD,
        tags = {"Array", "String", "Dynamic Programming", "Backtracking", "Bit Manipulation", "Bitmask"}
)
public class _1255 {

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] lettersCount = new int[26];
        int[] usedCount = new int[26];
        for (char letter : letters) {
            lettersCount[letter - 'a']++;
        }
        int ans = 0;
        ans = backtracking(words, score, lettersCount, usedCount, 0, 0, ans);
        return ans;
    }

    private int backtracking(String[] words, int[] score, int[] lettersCount, int[] usedCount, int start, int temp, int ans) {
        for (int i = 0; i < lettersCount.length; i++) {
            if (lettersCount[i] < usedCount[i]) {
                return ans;
            }
        }
        ans = Math.max(ans, temp);

        for (int i = start; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            for (char c : word) {
                usedCount[c - 'a']++;
                temp += score[c - 'a'];
            }
            ans = backtracking(words, score, lettersCount, usedCount, i + 1, temp, ans);
            for (char c : word) {
                usedCount[c - 'a']--;
                temp -= score[c - 'a'];
            }
        }
        return ans;
    }


    public static class NotEfficient {

        public int maxScoreWords(String[] words, char[] letters, int[] score) {
            //Определить какие группы слов могут быть собраны
            int[] lettersCount = new int[26];
            for (char letter : letters) {
                lettersCount[letter - 'a']++;
            }

            Set<List<Integer>> wordList = new HashSet<>();
            wordListHelper(words, lettersCount, 0, new int[26], wordList);

            int maxScore = 0;
            for (List<Integer> letterCnt : wordList) {
                int currentScore = 0;
                for (int i = 0; i < letterCnt.size(); i++) {
                    currentScore += score[i] * letterCnt.get(i);
                }
                maxScore = Math.max(maxScore, currentScore);
            }
            return maxScore;
        }

        private void wordListHelper(String[] words, int[] lettersCount, int start, int[] acc, Set<List<Integer>> wordList) {
            if (start == words.length) {
                wordList.add(Arrays.stream(acc).boxed().toList());
            }
            for (int i = start; i < words.length; i++) {
                char[] word = words[i].toCharArray();
                boolean canConstruct = canConstruct(word, Arrays.copyOf(lettersCount, 26));
                if (canConstruct) {
                    substract(lettersCount, word);
                    add(acc, word);
                    wordListHelper(words, lettersCount, i + 1, acc, wordList);
                    add(lettersCount, word);
                    substract(acc, word);
                } else {
                    wordListHelper(words, lettersCount, start + 1, acc, wordList);
                }
            }
        }

        private void substract(int[] target, char[] word) {
            for (char c : word) {
                target[c - 'a']--;
            }
        }


        private void add(int[] target, char[] word) {
            for (char c : word) {
                target[c - 'a']++;
            }
        }

        private boolean canConstruct(char[] word, int[] lettersCount) {
            for (char c : word) {
                int i = c - 'a';
                if (lettersCount[i] > 0) {
                    lettersCount[i]--;
                } else return false;
            }
            return true;
        }
    }

}