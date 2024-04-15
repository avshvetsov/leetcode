package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 129,
        name = "Sum Root to Leaf Numbers",
        level = Level.MEDIUM,
        tags = {"Tree", "Depth-First Search", "Binary Tree"}
)
public class _129 {

    public int sumNumbers(TreeNode root) {
        return sumHelper(root, 0);
    }

    public int sumHelper(TreeNode current, int sum) {
        if (current.left == null && current.right == null) {
            return sum * 10 + current.val;
        }
        int left = 0;
        int right = 0;
        if (current.left != null) {
            left = sumHelper(current.left, sum * 10 + current.val);
        }
        if (current.right != null) {
            right = sumHelper(current.right, sum * 10 + current.val);
        }
        return left + right;
    }

}