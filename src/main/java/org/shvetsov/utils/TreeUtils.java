package org.shvetsov.utils;


import org.shvetsov.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtils {

    private TreeUtils() {
    }

//    public static TreeNode constructTreeNode(Integer... array) {
//        return constructTreeHelper(array, 0);
//    }

//    private static TreeNode constructTreeHelper(Integer[] arr, int index) {
//        if (index >= arr.length || arr[index] == null) {
//            return null;
//        }
//
//        TreeNode root = new TreeNode(arr[index]);
//        root.left = constructTreeHelper(arr, 2 * index + 1);
//        root.right = constructTreeHelper(arr, 2 * index + 2);
//
//        return root;
//    }

    public static TreeNode constructTreeNode(Integer... treeValues) {
        TreeNode root = new TreeNode(treeValues[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        for (int i = 1; i < treeValues.length; i++) {
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
