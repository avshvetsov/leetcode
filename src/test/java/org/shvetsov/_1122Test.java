package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1122Test {

    private static _1122 task;

    @BeforeEach
    public void setup() {
        task = new _1122();
    }

    @Test
    void relativeSortArrayExample1() {
        assertThat(task.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6}))
                .containsExactly(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19);
    }

    @Test
    void relativeSortArrayExample2() {
        assertThat(task.relativeSortArray(new int[]{28, 6, 22, 8, 44, 17}, new int[]{22, 28, 8, 6}))
                .containsExactly(22, 28, 8, 6, 17, 44);
    }
}