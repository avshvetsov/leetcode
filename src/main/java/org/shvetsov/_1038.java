package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1038,
        name = "Binary Search Tree to Greater Sum Tree",
        level = Level.MEDIUM,
        tags = {"Tree", "Depth-First Search", "Binary Search Tree", "Binary Tree"}
)
public class _1038 {
    public TreeNode bstToGst(TreeNode root) {
        dfs(root, 0);
        return root;
    }

    public int dfs(TreeNode curr, int acc) {
        int sum = 0;
        if (curr.right != null) {
            sum += dfs(curr.right, sum + acc);
        }
        sum += curr.val;
        curr.val = sum + acc;
        if (curr.left != null) {
            sum += dfs(curr.left, sum + acc);
        }
        return sum;
    }
}