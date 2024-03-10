package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.LinkedListUtils.constructListNode;

class _2095Test {

    private static _2095 task;

    @BeforeEach
    public void setup() {
        task = new _2095();
    }

    @Test
    void deleteMiddle() {
        assertThat(task.deleteMiddle(constructListNode(1, 3, 4, 7, 1, 2, 6))).isEqualTo(constructListNode(1, 3, 4, 1, 2, 6));
        assertThat(task.deleteMiddle(constructListNode(1, 2, 3, 4))).isEqualTo(constructListNode(1, 2, 4));
        assertThat(task.deleteMiddle(constructListNode(2, 1))).isEqualTo(constructListNode(2));
    }
}