package org.shvetsov;

import org.shvetsov.classes.ListNode;
import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 1367,
        name = "Linked List in Binary Tree",
        level = Level.MEDIUM,
        tags = {"Linked List", "Tree", "Depth-First Search", "Breadth-First Search", "Binary Tree"}
)
public class _1367 {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;
        if (dfs(root, head)) return true;
        if (isSubPath(head, root.left)) return true;
        if (isSubPath(head, root.right)) return true;
        return false;
    }

    private boolean dfs(TreeNode currT, ListNode currL) {
        if (currL == null) {
            return true;
        }
        if (currT == null) {
            return false;
        }

        if (currT.val == currL.val) {
            if (dfs(currT.left, currL.next)) return true;
            if (dfs(currT.right, currL.next)) return true;
        }
        return false;
    }
}