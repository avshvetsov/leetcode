package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.*;
import java.util.stream.Collectors;

@LeetCode(
        number = 1110,
        name = "Delete Nodes And Return Forest",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Tree", "Depth-First Search", "Binary Tree"}
)
public class _1110 {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> toDeleteSet = Arrays.stream(to_delete).boxed().collect(Collectors.toSet());
        boolean isDeleted = toDeleteSet.contains(root.val);
        List<TreeNode> result = new ArrayList<>();
        if (!isDeleted) {
            result.add(root);
        }
        return dfs(result, root, toDeleteSet, isDeleted);
    }

    private List<TreeNode> dfs(List<TreeNode> result, TreeNode root, Set<Integer> toDeleteSet, boolean isDeleted) {
        if (root.left != null) {
            boolean isLeftDeleted = toDeleteSet.contains(root.left.val);
            dfs(result, root.left, toDeleteSet, isLeftDeleted);
            if (isDeleted && !isLeftDeleted) {
                result.add(root.left);
            }
            if (isLeftDeleted) {
                root.left = null;
            }
        }
        if (root.right != null) {
            boolean isRightDeleted = toDeleteSet.contains(root.right.val);
            dfs(result, root.right, toDeleteSet, isRightDeleted);
            if (isDeleted && !isRightDeleted) {
                result.add(root.right);
            }
            if (isRightDeleted) {
                root.right = null;
            }
        }
        return result;
    }
}