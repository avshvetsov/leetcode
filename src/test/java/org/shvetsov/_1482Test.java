package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1482Test {

    private static _1482 task;

    @BeforeEach
    public void setup() {
        task = new _1482();
    }

    @Test
    void minDaysExample1() {
        assertThat(task.minDays(new int[]{1, 10, 3, 10, 2}, 3, 1)).isEqualTo(3);
    }

    @Test
    void minDaysExample2() {
        assertThat(task.minDays(new int[]{1, 10, 3, 10, 2}, 3, 2)).isEqualTo(-1);
    }

    @Test
    void minDaysExample3() {
        assertThat(task.minDays(new int[]{7, 7, 7, 7, 12, 7, 7}, 2, 3)).isEqualTo(12);
    }
}