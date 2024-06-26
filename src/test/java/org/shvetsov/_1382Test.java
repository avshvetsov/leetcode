package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _1382Test {

    private static _1382 task;

    @BeforeEach
    public void setup() {
        task = new _1382();
    }

    @Test
    void balanceBSTExample1() {
        assertThat(task.balanceBST(TreeUtils.constructTreeNode(1, null, 2, null, 3, null, 4, null, null)))
                .isEqualTo(TreeUtils.constructTreeNode(2, 1, 3, null, null, null, 4));
    }

    @Test
    void balanceBSTExample2() {
        assertThat(task.balanceBST(TreeUtils.constructTreeNode(2, 1, 3)))
                .isEqualTo(TreeUtils.constructTreeNode(2, 1, 3));
    }
}