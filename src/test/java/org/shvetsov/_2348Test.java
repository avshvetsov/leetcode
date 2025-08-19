package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2348Test {

    private static _2348 task;

    @BeforeEach
    public void setup() {
        task = new _2348();
    }

    @Test
    void zeroFilledSubarrayExample1() {
        assertThat(task.zeroFilledSubarray(new int[]{1, 3, 0, 0, 2, 0, 0, 4})).isEqualTo(6);
    }

    @Test
    void zeroFilledSubarrayExample2() {
        assertThat(task.zeroFilledSubarray(new int[]{0, 0, 0, 2, 0, 0})).isEqualTo(9);
    }

    @Test
    void zeroFilledSubarrayExample3() {
        assertThat(task.zeroFilledSubarray(new int[]{2, 10, 2019})).isEqualTo(0);
    }
}