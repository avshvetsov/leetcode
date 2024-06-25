package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _1038Test {

    private static _1038 task;

    @BeforeEach
    public void setup() {
        task = new _1038();
    }

    @Test
    void bstToGstExample1() {
        assertThat(task.bstToGst(TreeUtils.constructTreeNode(4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8)))
                .isEqualTo(TreeUtils.constructTreeNode(30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8));
    }

    @Test
    void bstToGstExample2() {
        assertThat(task.bstToGst(TreeUtils.constructTreeNode(0, null, 1)))
                .isEqualTo(TreeUtils.constructTreeNode(1, null, 1));
    }
}