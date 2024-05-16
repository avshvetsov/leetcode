package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2331,
        name = "Evaluate Boolean Binary Tree",
        level = Level.EASY,
        tags = {"Tree", "Depth-First Search", "Binary Tree"}
)
public class _2331 {
    public boolean evaluateTree(TreeNode root) {
        return switch (root.val) {
            case 0 -> false;
            case 1 -> true;
            case 2 -> evaluateTree(root.left) || evaluateTree(root.right);
            case 3 -> evaluateTree(root.left) && evaluateTree(root.right);
            default -> false;
        };
    }
}