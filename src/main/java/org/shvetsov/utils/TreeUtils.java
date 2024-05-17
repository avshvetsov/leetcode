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

    public static void prettyPrintTree(TreeNode node, String prefix, boolean isLeft) {
        if (node == null) {
            System.out.println("Empty tree");
            return;
        }

        if (node.right != null) {
            prettyPrintTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
        }

        System.out.println(prefix + (isLeft ? "└── " : "┌── ") + node.val);

        if (node.left != null) {
            prettyPrintTree(node.left, prefix + (isLeft ? "    " : "│   "), true);
        }
    }

    public static void prettyPrintTree(TreeNode node) {
        prettyPrintTree(node,  "", true);
    }



    public static void prettyPrintTree(TreeNode node, String prefix, boolean isLeft, StringBuilder acc) {
        if (node == null) {
            acc.append("Empty tree");
            return;
        }

        if (node.right != null) {
            prettyPrintTree(node.right, prefix + (isLeft ? "│   " : "    "), false, acc);
        }

        acc.append(prefix).append(isLeft ? "└── " : "┌── ").append(node.val).append("\n");

        if (node.left != null) {
            prettyPrintTree(node.left, prefix + (isLeft ? "    " : "│   "), true, acc);
        }
    }

    public static String treeToString(TreeNode node) {
        StringBuilder acc = new StringBuilder("\n");
        prettyPrintTree(node, "", true, acc);
        return acc.toString();
    }
}
