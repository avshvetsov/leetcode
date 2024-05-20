package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3068Test {

    private static _3068 task;

    @BeforeEach
    public void setup() {
        task = new _3068();
    }

    @Test
    void maximumValueSumExample1() {
        assertThat(task.maximumValueSum(new int[]{1, 2, 1}, 3, new int[][]{{0, 1}, {0, 2}})).isEqualTo(6);
    }

    @Test
    void maximumValueSumExample2() {
        assertThat(task.maximumValueSum(new int[]{2, 3}, 7, new int[][]{{0, 1}})).isEqualTo(9);
    }

    @Test
    void maximumValueSumExample3() {
        assertThat(task.maximumValueSum(new int[]{7, 7, 7, 7, 7, 7}, 3, new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}})).isEqualTo(42);
    }
}