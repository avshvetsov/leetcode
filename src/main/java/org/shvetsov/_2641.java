package org.shvetsov;

import org.apache.commons.math3.util.Pair;
import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;
import java.util.stream.Collectors;

@LeetCode(
        number = 2641,
        name = "Cousins in Binary Tree II",
        level = Level.MEDIUM,
        tags = {"Hash Table", "Tree", "Depth-First Search", "Breadth-First Search", "Binary Tree"}
)
public class _2641 {
    public TreeNode replaceValueInTree(TreeNode root) {
        List<Pair<TreeNode,TreeNode>> current = new ArrayList<>();
        Map<TreeNode, Integer> values = new HashMap<>();
        values.put(root, 0);
        current.add(new Pair<>(root, root));
        while (!current.isEmpty()) {
            List<Pair<TreeNode,TreeNode>> next = new ArrayList<>();
            int sum = current.stream().mapToInt(value -> value.getKey().val).sum();
            Map<TreeNode, Integer> cousinsSum = current.stream()
                    .collect(Collectors.groupingBy(Pair::getValue, Collectors.summingInt(value -> value.getKey().val)));
            for (Pair<TreeNode,TreeNode> pair : current) {
                values.put(pair.getKey(), sum - cousinsSum.get(pair.getValue()));
                if (pair.getKey().left != null) {
                    next.add(new Pair<>(pair.getKey().left, pair.getKey()));
                }
                if (pair.getKey().right != null) {
                    next.add(new Pair<>(pair.getKey().right, pair.getKey()));
                }
            }
            current = next;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            node.val = values.get(node);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }
}