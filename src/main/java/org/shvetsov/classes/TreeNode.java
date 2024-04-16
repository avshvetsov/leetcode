package org.shvetsov.classes;

import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreeNode treeNode)) return false;

        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + Objects.hashCode(left);
        result = 31 * result + Objects.hashCode(right);
        return result;
    }


    @Override
    public String toString() {
        return "\n" + print(this, 0);
    }


    private static final String space = "      ";

    private String print(TreeNode node, int deep) {
        StringBuilder res = new StringBuilder();
        if (node == null) {
            res.append(printSpace(deep));
            res.append("#\n");
            return res.toString();
        }
        res.append(print(node.right, deep + 1));
        res.append(printSpace(deep));
        res.append(printNode(node.val));
        res.append(print(node.left, deep + 1));
        return res.toString();
    }

    private static String printSpace(int count) {
        return space.repeat(Math.max(0, count));
    }

    private static String printNode(int val) {
        StringBuilder res = new StringBuilder(val + "<");
        int spaceNum = space.length() - res.length();
        res.append(" ".repeat(Math.max(0, spaceNum)));
        res.append("\n");
        return res.toString();
    }
}





