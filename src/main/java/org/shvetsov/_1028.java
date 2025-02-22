package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1028,
        name = "Recover a Tree From Preorder Traversal",
        level = Level.HARD,
        tags = {"String", "Tree", "Depth-First Search", "Binary Tree"}
)
public class _1028 {
    public TreeNode recoverFromPreorder(String traversal) {
        int rootVal = getNodeValue(traversal);
        TreeNode root = new TreeNode(rootVal);
        recoverRecursive(root, traversal.substring(String.valueOf(rootVal).length()), 1);
        return root;
    }

    private String recoverRecursive(TreeNode current, String traversal, int level) {
        int dashes = countStartDashes(traversal);
        int value = getNodeValue(traversal.substring(dashes));
        if (level == dashes) {
            current.left = new TreeNode(value);
            traversal = traversal.substring(String.valueOf(value).length() + dashes);
            traversal = recoverRecursive(current.left, traversal, level + 1);
        }


        dashes = countStartDashes(traversal);
        value = getNodeValue(traversal.substring(dashes));
        if (level == dashes) {
            current.right = new TreeNode(value);
            traversal = traversal.substring(String.valueOf(value).length() + dashes);
            traversal = recoverRecursive(current.right, traversal, level + 1);
        }
        return traversal;
    }

    private int getNodeValue(String traversal) {
        int dash = traversal.indexOf('-');
        return dash == -1 ? traversal.isEmpty() ? -1 :Integer.parseInt(traversal) : Integer.parseInt(traversal.substring(0, dash));
    }

    private int countStartDashes(String traversal) {
        int count = 0;
        while (!traversal.isEmpty() && traversal.charAt(count) == '-') {
            count++;
        }
        return count;
    }
}