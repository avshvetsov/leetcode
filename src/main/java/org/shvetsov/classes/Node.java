package org.shvetsov.classes;

import org.shvetsov.utils.NodeUtils;

import java.util.List;

/**
 * This is a representation of a n-ary tree
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    @Override
    public String toString() {
        return NodeUtils.asString(this, 0, true);
    }


}
