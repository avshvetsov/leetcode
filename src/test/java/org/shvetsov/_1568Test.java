package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1568Test {

    private static _1568 task;

    @BeforeEach
    public void setup() {
        task = new _1568();
    }

    @Test
    void minDaysExample1() {
        assertThat(task.minDays(new int[][]{{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}})).isEqualTo(2);
    }

    @Test
    void minDaysExample2() {
        assertThat(task.minDays(new int[][]{{1, 1}})).isEqualTo(2);
    }

    @Test
    void minDaysTC87() {
        assertThat(task.minDays(new int[][]{{1, 1, 0, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 0, 1, 1}, {1, 1, 0, 1, 1}})).isEqualTo(1);
    }
}