package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _404Test {

    private static _404 task;

    @BeforeEach
    public void setup() {
        task = new _404();
    }

    @Test
    void sumOfLeftLeaves() {
        assertThat(task.sumOfLeftLeaves(TreeUtils.constructTreeNode(3, 9, 20, null, null, 15, 7))).isEqualTo(24);
        assertThat(task.sumOfLeftLeaves(TreeUtils.constructTreeNode(1))).isEqualTo(0);
    }

    @Test
    void sumOfLeftLeaves1() {
        assertThat(task.sumOfLeftLeaves(TreeUtils.constructTreeNode(1, 2))).isEqualTo(2);
    }
}