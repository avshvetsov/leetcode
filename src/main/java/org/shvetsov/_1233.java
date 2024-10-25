package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;

@LeetCode(
        number = 1233,
        name = "Remove Sub-Folders from the Filesystem",
        level = Level.MEDIUM,
        tags = {"Array", "String", "Depth-First Search", "Trie"}
)
public class _1233 {
    public List<String> removeSubfolders(String[] folder) {
        TrieNode root = new TrieNode();
        Arrays.sort(folder, Comparator.comparingInt(String::length));
        List<String> result = new ArrayList<>();
        for (String s : folder) {
            if (root.insert(s.split("/"))) {
                result.add(s);
            }
        }
        return result;
    }

    public class TrieNode {

        Map<String, TrieNode> children = new HashMap<>();
        boolean isEnd = false;

        public TrieNode() {
        }

        public boolean insert(String[] strings) {
            Map<String, TrieNode> childs = children;
            TrieNode current = this;
            for (String s : strings) {
                current = childs.computeIfAbsent(s, k -> new TrieNode());
                if (current.isEnd) return false;
                childs = current.children;
            }
            current.isEnd = true;
            return true;
        }
    }
}