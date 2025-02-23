package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.Arrays;

@LeetCode(
        number = 889,
        name = "Construct Binary Tree from Preorder and Postorder Traversal",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Divide and Conquer", "Tree", "Binary Tree"}
)
public class _889 {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode();
        if (preorder[0] == postorder[postorder.length - 1]) {
            root.val = preorder[0];
        } else throw new IllegalArgumentException("Invalid preorder/postorder");

        if (preorder.length > 1 && postorder.length > 1){
            if (preorder[1] != postorder[postorder.length - 2]) {
                int i = getIndexOf(preorder, postorder[postorder.length - 2]);
                int j = getIndexOf(postorder, preorder[1]);
                root.left = constructFromPrePost(Arrays.copyOfRange(preorder, 1, i), Arrays.copyOfRange(postorder, 0, j + 1));
                root.right = constructFromPrePost(Arrays.copyOfRange(preorder, i, preorder.length), Arrays.copyOfRange(postorder, j + 1, postorder.length - 1));
            } else {
                root.left = constructFromPrePost(Arrays.copyOfRange(preorder, 1, preorder.length), Arrays.copyOfRange(postorder, 0, postorder.length - 1));
            }
        }
        return root;
    }

    private int getIndexOf(int[] array, int val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) return i;
        }
        throw new IllegalArgumentException("Invalid not found");
    }
}