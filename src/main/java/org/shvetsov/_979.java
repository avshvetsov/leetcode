package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 979,
        name = "Distribute Coins in Binary Tree",
        level = Level.MEDIUM,
        tags = {"Tree", "Depth-First Search", "Binary Tree"}
)
public class _979 {

    int res = 0;

    public int distributeCoins(TreeNode root) {
        int[] ans = distributeHelper(root);
        res += ans[1];
        return res;
    }

    //resp [0] - debt count, [1] - debt cost, [2] - coins
    private int[] distributeHelper(TreeNode curr) {
        if (curr.left == null && curr.right == null) {
            if (curr.val == 0) {
                return new int[]{1, 1, 0};
            } else {
                res += curr.val - 1;
                return new int[]{0, 0, curr.val - 1};
            }
        }
        int[] ans = new int[3];
        int[] left = new int[]{0,0,0};
        int[] right = new int[]{0,0,0};
        if (curr.left != null) {
            left = distributeHelper(curr.left);
        }
        if (curr.right != null) {
            right = distributeHelper(curr.right);
        }
        int currCoins = curr.val + left[2] + right[2];
        int currDebtCounts = left[0] + right[0];
        int currDebtCosts = left[1] + right[1];
        if (currCoins == 0) {
            ans[0] = currDebtCounts + 1;
            ans[1] = currDebtCosts + ans[0];
        } else {
            if (currCoins > currDebtCounts) {
                ans[1] = currDebtCosts;
                ans[2] = currCoins - currDebtCounts - 1;
                res += ans[2];
            } else {
                ans[0] = currDebtCounts - currCoins + 1;
                ans[1] = currDebtCosts + ans[0];
            }
        }

        return ans;
    }
}