package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _2331Test {

    private static _2331 task;

    @BeforeEach
    public void setup() {
        task = new _2331();
    }

    @Test
    void evaluateTreeExample1() {
        assertThat(task.evaluateTree(TreeUtils.constructTreeNode(2, 1, 3, null, null, 0, 1))).isTrue();
    }

    @Test
    void evaluateTreeExample2() {
        assertThat(task.evaluateTree(TreeUtils.constructTreeNode(0))).isFalse();
    }
}