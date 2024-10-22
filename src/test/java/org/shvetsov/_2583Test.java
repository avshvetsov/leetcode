package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _2583Test {

    private static _2583 task;

    @BeforeEach
    public void setup() {
        task = new _2583();
    }

    @Test
    void kthLargestLevelSumExample1() {
        assertThat(task.kthLargestLevelSum(TreeUtils.constructTreeNode(5, 8, 9, 2, 1, 3, 7, 4, 6), 2)).isEqualTo(13);
    }

    @Test
    void kthLargestLevelSumExample2() {
        assertThat(task.kthLargestLevelSum(TreeUtils.constructTreeNode(1, 2, null, 3), 1)).isEqualTo(3);
    }
}