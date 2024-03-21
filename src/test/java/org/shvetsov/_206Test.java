package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.LinkedListUtils.constructListNode;

class _206Test {

    private static _206 task;

    @BeforeEach
    public void setup() {
        task = new _206();
    }

    @Test
    void reverseList() {
        assertThat(task.reverseList(constructListNode(1, 2, 3, 4, 5))).isEqualTo(constructListNode(1, 2, 3, 4, 5));
        assertThat(task.reverseList(constructListNode(1, 2))).isEqualTo(constructListNode(2, 1));
        assertThat(task.reverseList(null)).isEqualTo(null);
    }
}