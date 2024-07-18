package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _1530Test {

    private static _1530 task;

    @BeforeEach
    public void setup() {
        task = new _1530();
    }

    @Test
    void countPairsExample1() {
        assertThat(task.countPairs(TreeUtils.constructTreeNode(1, 2, 3, null, 4), 3)).isEqualTo(1);
    }

    @Test
    void countPairsExample2() {
        assertThat(task.countPairs(TreeUtils.constructTreeNode(1, 2, 3, 4, 5, 6, 7), 3)).isEqualTo(2);
    }

    @Test
    void countPairsExample3() {
        assertThat(task.countPairs(TreeUtils.constructTreeNode(7, 1, 4, 6, null, 5, 3, null, null, null, null, null, 2), 3)).isEqualTo(1);
    }
}