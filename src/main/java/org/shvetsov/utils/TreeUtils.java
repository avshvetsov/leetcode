package org.shvetsov.utils;


import org.shvetsov.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtils {

    private TreeUtils() {
    }

    public static TreeNode constructTreeNode(Integer... treeValues) {
        TreeNode root = new TreeNode(treeValues[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        for (int i = 1; i < treeValues.length && !queue.isEmpty(); i++) {
            TreeNode curr = queue.poll();
            if (treeValues[i] != null) {
                curr.left = new TreeNode(treeValues[i]);
                queue.offer(curr.left);
            }
            if (++i < treeValues.length && treeValues[i] != null) {
                curr.right = new TreeNode(treeValues[i]);
                queue.offer(curr.right);
            }
        }
        return root;
    }
}
