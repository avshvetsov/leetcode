package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _979Test {

    private static _979 task;

    @BeforeEach
    public void setup() {
        task = new _979();
    }

    @Test
    void distributeCoinsExample1() {
        assertThat(task.distributeCoins(TreeUtils.constructTreeNode(3, 0, 0))).isEqualTo(2);
    }

    @Test
    void distributeCoinsExample2() {
        assertThat(task.distributeCoins(TreeUtils.constructTreeNode(0, 3, 0))).isEqualTo(3);
    }
}