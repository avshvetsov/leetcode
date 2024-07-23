package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1636Test {

    private static _1636 task;

    @BeforeEach
    public void setup() {
        task = new _1636();
    }

    @Test
    void frequencySortExample1() {
        assertThat(task.frequencySort(new int[]{1, 1, 2, 2, 2, 3})).isEqualTo(new int[]{3, 1, 1, 2, 2, 2});
    }

    @Test
    void frequencySortExample2() {
        assertThat(task.frequencySort(new int[]{2, 3, 1, 3, 2})).isEqualTo(new int[]{1, 3, 3, 2, 2});
    }

    @Test
    void frequencySortExample3() {
        assertThat(task.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1})).isEqualTo(new int[]{5, -1, 4, 4, -6, -6, 1, 1, 1});
    }
}