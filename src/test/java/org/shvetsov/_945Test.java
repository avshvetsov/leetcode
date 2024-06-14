package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _945Test {

    private static _945 task;

    @BeforeEach
    public void setup() {
        task = new _945();
    }

    @Test
    void minIncrementForUniqueExample1() {
        assertThat(task.minIncrementForUnique(new int[]{1, 2, 2})).isEqualTo(1);
    }

    @Test
    void minIncrementForUniqueExample2() {
        assertThat(task.minIncrementForUnique(new int[]{3, 2, 1, 2, 1, 7})).isEqualTo(6);
    }

    @Test
    void minIncrementForUniqueTC35() {
        assertThat(task.minIncrementForUnique(new int[]{0, 0})).isEqualTo(1);
    }

    @Test
    void minIncrementForUniqueMy1() {
        assertThat(task.minIncrementForUnique(new int[]{99998, 99998, 99998, 99998, 99999, 99999, 99999, 99999})).isEqualTo(24);
    }
}