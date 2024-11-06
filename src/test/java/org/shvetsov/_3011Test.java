package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3011Test {

    private static _3011 task;

    @BeforeEach
    public void setup() {
        task = new _3011();
    }

    @Test
    void canSortArrayExample1() {
        assertThat(task.canSortArray(new int[]{8, 4, 2, 30, 15})).isTrue();
    }

    @Test
    void canSortArrayExample2() {
        assertThat(task.canSortArray(new int[]{1, 2, 3, 4, 5})).isTrue();
    }

    @Test
    void canSortArrayExample3() {
        assertThat(task.canSortArray(new int[]{3, 16, 8, 4, 2})).isFalse();
    }
}