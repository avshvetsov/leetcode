package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@LeetCode(
        number = 1261,
        name = "Find Elements in a Contaminated Binary Tree",
        level = Level.MEDIUM,
        tags = {"Hash Table", "Tree", "Depth-First Search", "Breadth-First Search", "Design", "Binary Tree"}
)
public class _1261 {
    static class FindElements {

        private final Set<Integer> values = new HashSet<>();

        public FindElements(TreeNode root) {
            //bfs
            root.val = 0;
            values.add(root.val);
            List<TreeNode> nodes = new ArrayList<>();
            nodes.add(root);
            while (!nodes.isEmpty()) {
                List<TreeNode> next = new ArrayList<>();
                for (TreeNode node : nodes) {
                    if (node.left != null) {
                        node.left.val = node.val * 2 + 1;
                        values.add(node.left.val);
                        next.add(node.left);
                    }
                    if (node.right != null) {
                        node.right.val = node.val * 2 + 2;
                        values.add(node.right.val);
                        next.add(node.right);
                    }
                }
                nodes = next;
            }
        }

        public boolean find(int target) {
            return values.contains(target);
        }
    }
}