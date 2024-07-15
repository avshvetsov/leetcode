package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _2196Test {

    private static _2196 task;

    @BeforeEach
    public void setup() {
        task = new _2196();
    }

    @Test
    void createBinaryTreeExample1() {
        assertThat(task.createBinaryTree(new int[][]{{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}}))
                .isEqualTo(TreeUtils.constructTreeNode(50, 20, 80, 15, 17, 19));
    }

    @Test
    void createBinaryTreeExample2() {
        assertThat(task.createBinaryTree(new int[][]{{1, 2, 1}, {2, 3, 0}, {3, 4, 1}}))
                .isEqualTo(TreeUtils.constructTreeNode(1, 2, null, null, 3, 4));
    }
}