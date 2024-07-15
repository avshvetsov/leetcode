package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _2196Test {

    private static _2196 task;
    private static _2196.WithMap taskWithMap;

    @BeforeEach
    public void setup() {
        task = new _2196();
        taskWithMap = new _2196.WithMap();
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

    @Test
    void createBinaryTreeWithMapExample1() {
        assertThat(taskWithMap.createBinaryTree(new int[][]{{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}}))
                .isEqualTo(TreeUtils.constructTreeNode(50, 20, 80, 15, 17, 19));
    }

    @Test
    void createBinaryTreeWithMapExample2() {
        assertThat(taskWithMap.createBinaryTree(new int[][]{{1, 2, 1}, {2, 3, 0}, {3, 4, 1}}))
                .isEqualTo(TreeUtils.constructTreeNode(1, 2, null, null, 3, 4));
    }
}