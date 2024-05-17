package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1325,
        name = "Delete Leaves With a Given Value",
        level = Level.MEDIUM,
        tags = {"Tree", "Depth-First Search", "Binary Tree"}
)
public class _1325 {

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        dfs(root, target, new TreeNode(), true);
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }

    private void dfs(TreeNode current, int target, TreeNode prev, boolean isLeft) {
        if (current.left != null) {
            dfs(current.left, target, current, true);
        }
        if (current.right != null) {
            dfs(current.right, target, current, false);
        }
        if (current.left == null && current.right == null && current.val == target) {
            if (isLeft) prev.left = null;
            else prev.right = null;
        }
    }
}