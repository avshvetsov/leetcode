package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.NodeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _590Test {

    private static _590 task;

    @BeforeEach
    public void setup() {
        task = new _590();
    }

    @Test
    void postorderExample1() {
        assertThat(task.postorder(NodeUtils.constructNode(1, null, 3, 2, 4, null, 5, 6)))
                .containsExactly(5, 6, 3, 2, 4, 1);
    }

    @Test
    void postorderExample2() {
        assertThat(task.postorder(NodeUtils.constructNode(1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14)))
                .containsExactly(2, 6, 14, 11, 7, 3, 12, 8, 4, 13, 9, 10, 5, 1);
    }
}