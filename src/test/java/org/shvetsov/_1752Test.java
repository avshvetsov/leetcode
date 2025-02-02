package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1752Test {

    private static _1752 task;

    @BeforeEach
    public void setup() {
        task = new _1752();
    }

    @Test
    void checkExample1() {
        assertThat(task.check(new int[]{3, 4, 5, 1, 2})).isTrue();
    }

    @Test
    void checkExample2() {
        assertThat(task.check(new int[]{2, 1, 3, 4})).isFalse();
    }

    @Test
    void checkExample3() {
        assertThat(task.check(new int[]{1, 2, 3})).isTrue();
    }
}