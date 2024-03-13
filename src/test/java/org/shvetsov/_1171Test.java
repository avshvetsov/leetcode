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

    @Test
    void removeZeroSumSublists2() {
        assertThat(task.removeZeroSumSublists(constructListNode(1, -1))).isEqualTo(null);
    }

    @Test
    void removeZeroSumSublists3() {
        assertThat(task.removeZeroSumSublists(constructListNode(5, -3, -4, 1, 6, -2, -5))).satisfiesAnyOf(
                listNode -> assertThat(listNode).isEqualTo(constructListNode(5, -3, -4)),
                listNode -> assertThat(listNode).isEqualTo(constructListNode(5, -2, -5))
        );
    }

    @Test
    void removeZeroSumSublists4() {
        assertThat(task.removeZeroSumSublists(constructListNode(1, 2, 3, -4, 1, 5))).isEqualTo(constructListNode(1, 2, 5));
    }

    @Test
    void removeZeroSumSublists5() {
        assertThat(task.removeZeroSumSublists(constructListNode(2, 2, -2, 1, -1, -1))).isEqualTo(constructListNode(2, -1));
    }

    @Test
    void removeZeroSumSublists6() {
        assertThat(task.removeZeroSumSublists(constructListNode(1, 3, 2, -3, -2, 5, 5, -5, 1))).isEqualTo(constructListNode(1, 5, 1));
    }
    @Test
    void removeZeroSumSublists7() {
        assertThat(task.removeZeroSumSublists(constructListNode(1,0,2,-3))).isEqualTo(null);
    }
}