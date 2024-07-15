package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@LeetCode(
        number = 2196,
        name = "Create Binary Tree From Descriptions",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Tree", "Binary Tree"}
)
public class _2196 {
    public TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode[] nodes = new TreeNode[10000];
        Set<Integer> parents = new HashSet<>();
        Set<Integer> children = new HashSet<>();
        for (int[] description : descriptions) {
            //construct
            TreeNode parent = null;
            TreeNode child = null;
            if (nodes[description[0]] == null) {
                parent = new TreeNode(description[0]);
                nodes[description[0]] = parent;
            } else parent = nodes[description[0]];

            if (nodes[description[1]] == null) {
                child = new TreeNode(description[1]);
                nodes[description[1]] = child;
            } else child = nodes[description[1]];

            if (description[2] == 1) {
                parent.left = child;
            } else parent.right = child;

            //find head
            parents.add(parent.val);
            children.add(child.val);
        }
        parents.removeAll(children);
        return nodes[parents.toArray(new Integer[0])[0]];
    }

    public static class WithMap {
        public TreeNode createBinaryTree(int[][] descriptions) {
            Map<Integer, TreeNode> nodes = new HashMap<>();
            Set<Integer> parents = new HashSet<>();
            Set<Integer> children = new HashSet<>();
            for (int[] description : descriptions) {
                //construct
                TreeNode parent = nodes.computeIfAbsent(description[0], k -> new TreeNode(description[0]));
                TreeNode child = nodes.computeIfAbsent(description[1], k -> new TreeNode(description[1]));
                if (description[2] == 1) {
                    parent.left = child;
                } else parent.right = child;

                //find head
                parents.add(parent.val);
                children.add(child.val);
            }
            for (Integer parent : parents) {
                if (!children.contains(parent)) {
                    return nodes.get(parent);
                }
            }
            return null;
        }
    }
}