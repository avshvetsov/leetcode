package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2501Test {

    private static _2501 task;

    @BeforeEach
    public void setup() {
        task = new _2501();
    }

    @Test
    void longestSquareStreakExample1() {
        assertThat(task.longestSquareStreak(new int[]{4, 3, 6, 16, 8, 2})).isEqualTo(3);
    }

    @Test
    void longestSquareStreakExample2() {
        assertThat(task.longestSquareStreak(new int[]{2, 3, 5, 6, 7})).isEqualTo(-1);
    }
}