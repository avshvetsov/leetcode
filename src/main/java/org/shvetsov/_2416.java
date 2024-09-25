package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2416,
        name = "Sum of Prefix Scores of Strings",
        level = Level.HARD,
        tags = {"Array", "String", "Trie", "Counting"}
)
public class _2416 {

    TrieNode root = new TrieNode();

    public int[] sumPrefixScores(String[] words) {
        for (String word : words) {
//            root.insert(word); //with recursion
            insert(word);
        }
        int[] res = new int[words.length];
        for (int i = 0; i < words.length; i++) {
//            res[i] = root.countSum(words[i]); //with recursion
            res[i] = countSum(words[i]);
        }
        return res;
    }

    public void insert(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }
            curr.children[index].val++;
            curr = curr.children[index];
        }
    }

    public int countSum(String word) {
        TrieNode curr = root;
        int res = 0;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            res += curr.children[index].val;
            curr = curr.children[index];
        }
        return res;
    }


    public static class TrieNode {

        public int val = 0;
        public TrieNode[] children = new TrieNode[26];


        public void insert(String word) {
            if (word == null || word.isEmpty()) return;
            int index = word.charAt(0) - 'a';
            if (children[index] == null) children[index] = new TrieNode();

            children[index].val++;
            children[index].insert(word.substring(1));
        }

        public int countSum(String word) {
            if (word == null || word.isEmpty()) return 0;
            int index = word.charAt(0) - 'a';
            if (children[index] == null) throw new IllegalStateException();
            return children[index].val + children[index].countSum(word.substring(1));
        }
    }
}