package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 1382,
        name = "Balance a Binary Search Tree",
        level = Level.MEDIUM,
        tags = {"Divide and Conquer", "Greedy", "Tree", "Depth-First Search", "Binary Search Tree", "Binary Tree"}
)
public class _1382 {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nodes = collectToList(root, new ArrayList<>());
        return buildTree(nodes, 0, nodes.size());
    }

    //min - inclusive, max - exclusive
    private TreeNode buildTree(List<Integer> nodes, int min, int max) {
        if (max <= min) {
            return null;
        }
        int mid = (max + min) / 2;
        TreeNode curr = new TreeNode(nodes.get(mid));
        curr.left = buildTree(nodes, min, mid);
        curr.right = buildTree(nodes, mid + 1, max);
        return curr;
    }

    private List<Integer> collectToList(TreeNode curr, List<Integer> list) {
        if (curr.left != null) {
            collectToList(curr.left, list);
        }
        list.add(curr.val);
        if (curr.right != null) {
            collectToList(curr.right, list);
        }
        return list;
    }
}