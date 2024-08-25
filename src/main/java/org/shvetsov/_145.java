package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 145,
        name = "Binary Tree Postorder Traversal",
        level = Level.EASY,
        tags = {"Stack", "Tree", "Depth-First Search", "Binary Tree"}
)
public class _145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode current, List<Integer> result) {
        if (current == null) return;
        if (current.left != null) dfs(current.left, result);
        if (current.right != null) dfs(current.right, result);
        result.add(current.val);
    }
}