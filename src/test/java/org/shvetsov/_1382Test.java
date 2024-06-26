package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.TreeUtils.*;

class _1382Test {

    private static _1382 task;

    @BeforeEach
    public void setup() {
        task = new _1382();
    }

    @Test
    void balanceBSTExample1() {
        assertThat(task.balanceBST(constructTreeNode(1, null, 2, null, 3, null, 4, null, null)))
                .isIn(constructTreeNode(2, 1, 3, null, null, null, 4), constructTreeNode(3, 1, 4, null, 2));
    }

    @Test
    void balanceBSTExample2() {
        assertThat(task.balanceBST(constructTreeNode(2, 1, 3)))
                .isEqualTo(constructTreeNode(2, 1, 3));
    }
}