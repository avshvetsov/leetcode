package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

@LeetCode(
        number = 2096,
        name = "Step-By-Step Directions From a Binary Tree Node to Another",
        level = Level.MEDIUM,
        tags = {"String", "Tree", "Depth-First Search", "Binary Tree"}
)
public class _2096 {

    private String startRoute = null;
    private String destRoute = null;

    public String getDirections(TreeNode root, int startValue, int destValue) {
        findRoutesDFS(root, startValue, destValue, new StringBuilder());
        //find first diff chsr
        int i = 0;
        for (; i < startRoute.length() && i < destRoute.length() && startRoute.charAt(i) == destRoute.charAt(i); i++) {
        }
        return "U".repeat(startRoute.length() - i) + destRoute.substring(i);
    }

    private void findRoutesDFS(TreeNode curr, int startValue, int destValue, StringBuilder route) {
        if (startRoute != null && destRoute != null) {
            return;
        }
        if (curr.val == startValue) {
            startRoute = route.toString();
        }
        if (curr.val == destValue) {
            destRoute = route.toString();
        }

        if (curr.left != null) {
            findRoutesDFS(curr.left, startValue, destValue, route.append('L'));
            route.deleteCharAt(route.length() - 1);
        }
        if (curr.right != null) {
            findRoutesDFS(curr.right, startValue, destValue, route.append('R'));
            route.deleteCharAt(route.length() - 1);
        }
    }
}