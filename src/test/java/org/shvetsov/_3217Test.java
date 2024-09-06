package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.LinkedListUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _3217Test {

    private static _3217 task;

    @BeforeEach
    public void setup() {
        task = new _3217();
    }

    @Test
    void modifiedListExample1() {
        assertThat(task.modifiedList(new int[]{1, 2, 3}, LinkedListUtils.constructListNode(1, 2, 3, 4, 5)))
                .isEqualTo(LinkedListUtils.constructListNode(4, 5));
    }

    @Test
    void modifiedListExample2() {
        assertThat(task.modifiedList(new int[]{1}, LinkedListUtils.constructListNode(1, 2, 1, 2, 1, 2)))
                .isEqualTo(LinkedListUtils.constructListNode(2, 2, 2));
    }

    @Test
    void modifiedListExample3() {
        assertThat(task.modifiedList(new int[]{5}, LinkedListUtils.constructListNode(1, 2, 3, 4)))
                .isEqualTo(LinkedListUtils.constructListNode(1, 2, 3, 4));
    }
}