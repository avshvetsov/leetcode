package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.LinkedListUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _2816Test {

    private static _2816 task;

    @BeforeEach
    public void setup() {
        task = new _2816();
    }

    @Test
    void doubleIt() {
        assertThat(task.doubleIt(LinkedListUtils.constructListNode(1, 8, 9))).isEqualTo(LinkedListUtils.constructListNode(3, 7, 8));
        assertThat(task.doubleIt(LinkedListUtils.constructListNode(9, 9, 9))).isEqualTo(LinkedListUtils.constructListNode(1, 9, 9, 8));
    }
}