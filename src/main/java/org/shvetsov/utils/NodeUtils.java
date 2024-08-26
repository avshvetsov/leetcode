package org.shvetsov.utils;

import org.shvetsov.classes.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NodeUtils {

    private NodeUtils() {
    }

    public static Node constructNode(Integer... values) {
        if (values.length == 0 || values[0] == null) return null;
        Node root = new Node(values[0], new ArrayList<>());
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        for (int i = 2; i < values.length && !queue.isEmpty(); i++) {
            Node curr = queue.poll();
            while (i < values.length && values[i] != null) {
                Node child = new Node(values[i], new ArrayList<>());
                curr.children.add(child);
                queue.offer(child);
                i++;
            }
        }
        return root;
    }

    public static String asString(Node root, int level, boolean isLast) {
        StringBuilder sb = new StringBuilder();

        // Add indentation for the current level
        for (int i = 0; i < level - 1; i++) {
            sb.append("  ");
        }

        // Add connection symbols
        if (level > 0) {
            sb.append(isLast ? "└─ " : "├─ ");
        }

        // Print the current node value
        sb.append(root.val).append("\n");

        // If there are children, print them recursively
        if (root.children != null && !root.children.isEmpty()) {
            for (int i = 0; i < root.children.size(); i++) {
                sb.append(asString(root.children.get(i), level + 1, i == root.children.size() - 1));
            }
        }

        return sb.toString();
    }
}
