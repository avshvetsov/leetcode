package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _129Test {

    private static _129 task;

    @BeforeEach
    public void setup() {
        task = new _129();
    }

    @Test
    void sumNumbers() {
        assertThat(task.sumNumbers(TreeUtils.constructTreeNode(1, 2, 3))).isEqualTo(25);
        assertThat(task.sumNumbers(TreeUtils.constructTreeNode(4, 9, 0, 5, 1))).isEqualTo(1026);
    }
}