package org.shvetsov.utils;


import org.shvetsov.classes.TreeNode;

public class TreeUtils {

    private TreeUtils() {
    }

    public static TreeNode constructTreeNode(Integer... array) {
        return constructTreeHelper(array, 0);
    }

    private static TreeNode constructTreeHelper(Integer[] arr, int index) {
        if (index >= arr.length) {
            return null;
        }

        TreeNode root = new TreeNode(arr[index]);
        root.left = constructTreeHelper(arr, 2 * index + 1);
        root.right = constructTreeHelper(arr, 2 * index + 2);

        return root;
    }
}
