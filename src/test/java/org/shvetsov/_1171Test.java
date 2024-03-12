package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.shvetsov.utils.LinkedListUtils.constructListNode;

class _1171Test {

    private static _1171 task;

    @BeforeEach
    public void setup() {
        task = new _1171();
    }

    @Test
    void removeZeroSumSublists() {
        assertThat(task.removeZeroSumSublists(constructListNode(1, 2, -3, 3, 1))).satisfiesAnyOf(
                listNode -> assertThat(listNode).isEqualTo(constructListNode(1, 2, 1)),
                listNode -> assertThat(listNode).isEqualTo(constructListNode(3, 1))
        );
        assertThat(task.removeZeroSumSublists(constructListNode(1, 2, 3, -3, 4))).isEqualTo(constructListNode(1, 2, 4));
        assertThat(task.removeZeroSumSublists(constructListNode(1, 2, 3, -3, -2))).isEqualTo(constructListNode(1));
    }
}