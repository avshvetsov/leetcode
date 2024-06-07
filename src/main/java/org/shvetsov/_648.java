package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 648,
        name = "Replace Words",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "String", "Trie"}
)
public class _648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dictionarySet = new TreeSet<>(dictionary);
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            for (int j = 1; j <= split[i].length(); j++) {
                if (dictionarySet.contains(split[i].substring(0, j))) {
                    split[i] = split[i].substring(0, j);
                    break;
                }
            }
        }
        return String.join(" ", split);
    }

    public static class TrieSolution {
        Trie root;

        public String replaceWords(List<String> dictionary, String sentence) {
            root = new Trie();
            for (String word : dictionary) {
                insert(word);
            }
            StringBuilder result = new StringBuilder();
            String[] input = sentence.split(" ");
            for (String i : input) {
                result.append(search(i));
                result.append(" ");
            }
            return result.toString().trim();
        }

        public String search(String word) {
            Trie node = root;
            int j = 0;
            for (char c : word.toCharArray()) {
                int i = c - 'a';
                j++;
                if (node.children[i] == null) {
                    return word;
                } else if (node.children[i].isEnd) {
                    return word.substring(0, j);
                } else {
                    node = node.children[i];
                }

            }
            return word;

        }

        public void insert(String word) {
            Trie node = root;
            for (char c : word.toCharArray()) {
                int i = c - 'a';
                if (node.children[i] == null) {
                    node.children[i] = new Trie();
                }
                node = node.children[i];
            }
            node.isEnd = true;
        }
    }

    private static class Trie {
        Trie[] children;
        boolean isEnd;

        public Trie() {
            children = new Trie[26];
            isEnd = false;
        }
    }
}
