package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 988,
        name = "Smallest String Starting From Leaf",
        level = Level.MEDIUM,
        tags = {"String", "Tree", "Depth-First Search", "Binary Tree"}
)
public class _988 {

    private String min;

    public String smallestFromLeaf(TreeNode root) {
        smallestHelper(root, "");
        return min;
    }

    private void smallestHelper(TreeNode current, String str) {
        if (current == null) {
            return;
        }
        str = (char) ('a' + current.val) + str;
        if (current.left == null && current.right == null) {
            if (min == null || str.compareTo(min) < 0) {
                min = str;
            }
            return;
        }
        smallestHelper(current.left, str);
        smallestHelper(current.right, str);
    }



    //Hardest, but more efficient
    public String smallestFromLeafStringBuilder(TreeNode root) {
        smallestHelperStringBuilder(root, new StringBuilder());
        return min;
    }

    private void smallestHelperStringBuilder(TreeNode current, StringBuilder str) {
        if (current == null) {
            return;
        }
        str.append((char) ('a' + current.val));
        if (current.left == null && current.right == null) {
            String string = str.reverse().toString();
            str.reverse();
            if (min == null || string.compareTo(min) < 0) {
                min = string;
            }
            return;
        }
        smallestHelperStringBuilder(current.left, new StringBuilder(str.toString()));
        smallestHelperStringBuilder(current.right, new StringBuilder(str.toString()));
    }
}