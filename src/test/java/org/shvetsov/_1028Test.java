package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.TreeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _1028Test {

    private _1028 task;

    @BeforeEach
    public void setup() {
        task = new _1028();
    }

    @Test
    void recoverFromPreorderExample1() {
        assertThat(task.recoverFromPreorder("1-2--3--4-5--6--7")).isEqualTo(TreeUtils.constructTreeNode(1, 2, 5, 3, 4, 6, 7));
    }

    @Test
    void recoverFromPreorderExample2() {
        assertThat(task.recoverFromPreorder("1-2--3---4-5--6---7")).isEqualTo(TreeUtils.constructTreeNode(1, 2, 5, 3, null, 6, null, 4, null, 7));
    }

    @Test
    void recoverFromPreorderExample3() {
        assertThat(task.recoverFromPreorder("1-401--349---90--88")).isEqualTo(TreeUtils.constructTreeNode(1, 401, null, 349, 88, 90));
    }

}