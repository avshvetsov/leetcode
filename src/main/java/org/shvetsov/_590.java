package org.shvetsov;

import org.shvetsov.classes.Node;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 590,
        name = "N-ary Tree Postorder Traversal",
        level = Level.EASY,
        tags = {"Stack", "Tree", "Depth-First Search"}
)
public class _590 {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(Node current, List<Integer> result) {
        if (current == null || current.children == null) return;
        for (Node child : current.children) {
            dfs(child, result);
        }
        result.add(current.val);
    }
}