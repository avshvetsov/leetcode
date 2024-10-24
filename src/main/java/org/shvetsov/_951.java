package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 951,
        name = "Flip Equivalent Binary Trees",
        level = Level.MEDIUM,
        tags = {"Tree", "Depth-First Search", "Binary Tree"}
)
public class _951 {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return compareTwoNodes(root1, root2);
    }

    private boolean compareTwoNodes(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        } else {
            return node1.val == node2.val
                    && (compareTwoNodes(node1.left, node2.left) || compareTwoNodes(node1.left, node2.right))
                    && (compareTwoNodes(node1.right, node2.left) || compareTwoNodes(node1.right, node2.right));
        }
    }
}