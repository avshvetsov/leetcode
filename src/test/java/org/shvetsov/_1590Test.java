package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1590Test {

    private static _1590 task;

    @BeforeEach
    public void setup() {
        task = new _1590();
    }

    @Test
    void minSubarrayExample1() {
        assertThat(task.minSubarray(new int[]{3, 1, 4, 2}, 6)).isEqualTo(1);
    }

    @Test
    void minSubarrayExample2() {
        assertThat(task.minSubarray(new int[]{6, 3, 5, 2}, 9)).isEqualTo(2);
    }

    @Test
    void minSubarrayExample3() {
        assertThat(task.minSubarray(new int[]{1, 2, 3}, 3)).isEqualTo(0);
    }
}