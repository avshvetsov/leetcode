package org.shvetsov;

import org.shvetsov.classes.TreeNode;
import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 1530,
        name = "Number of Good Leaf Nodes Pairs",
        level = Level.MEDIUM,
        tags = {"Tree", "Depth-First Search", "Binary Tree"}
)
public class _1530 {
    public int countPairs(TreeNode root, int distance) {
        //transform into graph of GraphNode
        List<GraphNode> graph = new ArrayList<>();
        GraphNode curr = new GraphNode(root.val);
        curr.setLeaf(root.left == null && root.right == null);
        GraphNode left = null;
        GraphNode right = null;
        if (root.left != null) {
            left = buildGraph(root.left, curr, graph);
        }
        if (root.right != null) {
            right = buildGraph(root.right, curr, graph);
        }
        List<GraphNode> neighbours = new ArrayList<>();
        if (left != null) {
            neighbours.add(left);
        }
        if (right != null) {
            neighbours.add(right);
        }
        curr.setNeighbors(neighbours);
        graph.add(curr);

        int leafCount = 0;
        for (GraphNode graphNode : graph) {
            if (graphNode.isLeaf) {
                leafCount += findLeafInDistance(graphNode, null, distance);
            }
        }
        return leafCount / 2;
    }

    private int findLeafInDistance(GraphNode curr, GraphNode prev, int distance) {
        if (distance == 0) {
            return 0;
        }
        int result = 0;
        for (GraphNode neighbor : curr.neighbors) {
            if (neighbor != prev) {
                if (neighbor.isLeaf) {
                    result++;
                }
                result += findLeafInDistance(neighbor, curr, distance - 1);
            }
        }
        return result;
    }

    private GraphNode buildGraph(TreeNode currTreeNode, GraphNode prev, List<GraphNode> graph) {
        GraphNode curr = new GraphNode(currTreeNode.val);
        curr.setLeaf(currTreeNode.left == null && currTreeNode.right == null);
        List<GraphNode> neighbors = new ArrayList<>();
        neighbors.add(prev);
        if (currTreeNode.left != null) {
            neighbors.add(buildGraph(currTreeNode.left, curr, graph));
        }
        if (currTreeNode.right != null) {
            neighbors.add(buildGraph(currTreeNode.right, curr, graph));
        }
        curr.setNeighbors(neighbors);
        graph.add(curr);
        return curr;
    }

    public static class GraphNode {
        public int val;
        public boolean isLeaf;
        public List<GraphNode> neighbors;

        public GraphNode(int val) {
            this.val = val;
        }

        public GraphNode(int val, boolean isLeaf, List<GraphNode> neighbors) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.neighbors = neighbors;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public boolean isLeaf() {
            return isLeaf;
        }

        public void setLeaf(boolean leaf) {
            isLeaf = leaf;
        }

        public List<GraphNode> getNeighbors() {
            return neighbors;
        }

        public void setNeighbors(List<GraphNode> neighbors) {
            this.neighbors = neighbors;
        }
    }
}