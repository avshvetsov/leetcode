package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@LeetCode(
        number = 2583,
        name = "Kth Largest Sum in a Binary Tree",
        level = Level.MEDIUM,
        tags = {"Tree", "Breadth-First Search", "Sorting", "Binary Tree"}
)
public class _2583 {
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> sums = new ArrayList<>();
        List<TreeNode> current = new ArrayList<>();
        current.add(root);
        while (!current.isEmpty()) {
            long sum = 0L;
            List<TreeNode> next = new ArrayList<>();
            for (TreeNode tn : current) {
                sum += tn.val;
                if (tn.left != null) {
                    next.add(tn.left);
                }
                if (tn.right != null) {
                    next.add(tn.right);
                }
            }
            sums.add(sum);
            current = next;
        }
        sums.sort(Comparator.reverseOrder());
        if (sums.size() >= k) {
            return sums.get(k - 1);
        } else return -1;
    }
}