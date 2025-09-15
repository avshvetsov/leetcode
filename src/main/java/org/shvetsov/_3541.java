package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 3541,
        name = "Find Most Frequent Vowel and Consonant",
        level = Level.EASY,
        tags = {"Hash Table", "String", "Counting", "Biweekly Contest 156"}
)
public class _3541 {
    public int maxFreqSum(String s) {
        int[] freqVowel = new int[26];
        int[] freqConsonant = new int[26];
        for (char c : s.toCharArray()) {
            if ("aioeu".indexOf(c) != -1) {
                freqVowel[c - 'a']++;
            } else {
                freqConsonant[c - 'a']++;
            }
        }
        return Arrays.stream(freqVowel).max().getAsInt() + Arrays.stream(freqConsonant).max().getAsInt();
    }
}