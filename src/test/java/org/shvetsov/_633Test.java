package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _633Test {

    private static _633 task;

    @BeforeEach
    public void setup() {
        task = new _633();
    }

    @Test
    void judgeSquareSumExample1() {
        assertThat(task.judgeSquareSum(5)).isTrue();
    }

    @Test
    void judgeSquareSumExample2() {
        assertThat(task.judgeSquareSum(3)).isFalse();
    }
}