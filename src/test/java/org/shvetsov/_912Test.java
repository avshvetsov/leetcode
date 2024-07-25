package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _912Test {

    private static _912 task;

    @BeforeEach
    public void setup() {
        task = new _912();
    }

    @Test
    void sortArrayExample1() {
        assertThat(task.sortArray(new int[]{5, 2, 3, 1})).isEqualTo(new int[]{1, 2, 3, 5});
    }

    @Test
    void sortArrayExample2() {
        assertThat(task.sortArray(new int[]{5, 1, 1, 2, 0, 0})).isEqualTo(new int[]{0, 0, 1, 1, 2, 5});
    }
}