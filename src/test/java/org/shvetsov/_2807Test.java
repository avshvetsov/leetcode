package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.shvetsov.utils.LinkedListUtils;

import static org.assertj.core.api.Assertions.assertThat;

class _2807Test {

    private static _2807 task;

    @BeforeEach
    public void setup() {
        task = new _2807();
    }

    @Test
    void insertGreatestCommonDivisorsExample1() {
        assertThat(task.insertGreatestCommonDivisors(LinkedListUtils.constructListNode(18, 6, 10, 3)))
                .isEqualTo(LinkedListUtils.constructListNode(18, 6, 6, 2, 10, 1, 3));
    }

    @Test
    void insertGreatestCommonDivisorsExample2() {
        assertThat(task.insertGreatestCommonDivisors(LinkedListUtils.constructListNode(7)))
                .isEqualTo(LinkedListUtils.constructListNode(7));
    }

    @Test
    void insertGreatestCommonDivisorsTC421() {
        assertThat(task.insertGreatestCommonDivisors(LinkedListUtils.constructListNode(12, 16)))
                .isEqualTo(LinkedListUtils.constructListNode(12, 4, 16));
    }
}