package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 3043,
        name = "Find the Length of the Longest Common Prefix",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "String", "Trie"}
)
public class _3043 {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        TrieNode root = new TrieNode();
        //setup 1 array as trie
        for (int val : arr1) {
            TrieNode current = root;
            for (char c : String.valueOf(val).toCharArray()) {
                current = current.setAndGetChildren(c - '0');
            }
        }
        //find longest prefix
        int result = 0;
        for (int val : arr2) {
            TrieNode current = root;
            int prefSize = 0;
            for (char c : String.valueOf(val).toCharArray()) {
                int i = c - '0';
                if (current.isExist(i)) {
                    current = current.getChildren(i);
                    prefSize++;
                } else break;
            }
            result = Math.max(result, prefSize);
        }
        return result;
    }

    public static class TrieNode {
        private final TrieNode[] children;

        public TrieNode() {
            children = new TrieNode[10];
        }

        public TrieNode setAndGetChildren(int i) {
            if (children[i] == null) {
                children[i] = new TrieNode();
            }
            return children[i];
        }

        public TrieNode getChildren(int i) {
            return children[i];
        }

        public boolean isExist(int i) {
            return children[i] != null;
        }
    }
}