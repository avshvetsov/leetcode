package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 623,
        name = "Add One Row to Tree",
        level = Level.MEDIUM,
        tags = {"Tree", "Depth-First Search", "Breadth-First Search", "Binary Tree"}
)
public class _623 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            return new TreeNode(val, root, null);
        }
        depthSearchHelper(root, val, depth);
        return root;
    }

    private void depthSearchHelper(TreeNode root, int val, int depth) {
        if(root == null) return;
        if (depth == 2) {
            TreeNode left = root.left;
            TreeNode right = root.right;

            root.left = new TreeNode(val, left, null);
            root.right = new TreeNode(val, null, right);
            return;
        }
        depth--;
        depthSearchHelper(root.left, val, depth);
        depthSearchHelper(root.right, val, depth);
    }
}