package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1460Test {

    private static _1460 task;

    @BeforeEach
    public void setup() {
        task = new _1460();
    }

    @Test
    void canBeEqualExample1() {
        assertThat(task.canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3})).isTrue();
    }

    @Test
    void canBeEqualExample2() {
        assertThat(task.canBeEqual(new int[]{7}, new int[]{7})).isTrue();
    }

    @Test
    void canBeEqualExample3() {
        assertThat(task.canBeEqual(new int[]{3, 7, 9}, new int[]{3, 7, 11})).isFalse();
    }
}