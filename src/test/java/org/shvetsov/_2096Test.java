package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.classes.TreeNode;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _2096Test {

    private static _2096 task;

    @BeforeEach
    public void setup() {
        task = new _2096();
    }

    @Test
    void getDirectionsExample1() {
        assertThat(task.getDirections(TreeUtils.constructTreeNode(5, 1, 2, 3, null, 6, 4), 3, 6))
                .isEqualTo("UURL");
    }

    @Test
    void getDirectionsExample2() {
        assertThat(task.getDirections(TreeUtils.constructTreeNode(2, 1), 2, 1))
                .isEqualTo("L");
    }

    @Test
    void getDirectionsTC71() {
        TreeNode root = TreeUtils.constructTreeNode(7, 8, 3, 1, null, 4, 5, 6, null, null, null, null, null, null, 2);
        assertThat(task.getDirections(root, 7, 5)).as(root.toString())
                .isEqualTo("RR");
    }
}