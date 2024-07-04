package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.LinkedListUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.LinkedListUtils.*;

class _2181Test {

    private static _2181 task;

    @BeforeEach
    public void setup() {
        task = new _2181();
    }

    @Test
    void mergeNodesExample1() {
        assertThat(task.mergeNodes(constructListNode(0, 3, 1, 0, 4, 5, 2, 0)))
                .isEqualTo(constructListNode(4, 11));
    }

    @Test
    void mergeNodesExample2() {
        assertThat(task.mergeNodes(constructListNode(0, 1, 0, 3, 0, 2, 2, 0)))
                .isEqualTo(constructListNode(1, 3, 4));
    }
}