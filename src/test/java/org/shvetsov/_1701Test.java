package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1701Test {

    private static _1701 task;

    @BeforeEach
    public void setup() {
        task = new _1701();
    }

    @Test
    void averageWaitingTimeExample1() {
        assertThat(task.averageWaitingTime(new int[][]{{1, 2}, {2, 5}, {4, 3}})).isEqualTo(5);
    }

    @Test
    void averageWaitingTimeExample2() {
        assertThat(task.averageWaitingTime(new int[][]{{5, 2}, {5, 4}, {10, 3}, {20, 1}})).isEqualTo(3.25);
    }
}