package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 404,
        name = "Sum of Left Leaves",
        level = Level.EASY,
        tags = {"Tree", "Depth-First Search", "Breadth-First Search", "Binary Tree"}
)
public class _404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumHelper(root, false);
    }

    private int sumHelper(TreeNode current, boolean isLeft) {
        int res = 0;
        if (current.left == null && current.right == null && isLeft) {
            res += current.val;
        }
        if (current.left != null) res += sumHelper(current.left, true);
        if (current.right != null) res += sumHelper(current.right, false);
        return res;
    }


}