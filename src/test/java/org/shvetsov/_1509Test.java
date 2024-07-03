package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1509Test {

    private static _1509 task;

    @BeforeEach
    public void setup() {
        task = new _1509();
    }

    @Test
    void minDifferenceExample1() {
        assertThat(task.minDifference(new int[]{5, 3, 2, 4})).isEqualTo(0);
    }

    @Test
    void minDifferenceExample2() {
        assertThat(task.minDifference(new int[]{1, 5, 0, 10, 14})).isEqualTo(1);
    }

    @Test
    void minDifferenceExample3() {
        assertThat(task.minDifference(new int[]{3, 100, 20})).isEqualTo(0);
    }
}