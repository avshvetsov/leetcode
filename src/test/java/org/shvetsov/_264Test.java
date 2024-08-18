package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _264Test {

    private static _264 task;
    private static _264.LinearComplexity taskLinearComplexity;

    @BeforeEach
    public void setup() {
        task = new _264();
        taskLinearComplexity = new _264.LinearComplexity();
    }

    @Test
    void nthUglyNumberExample1() {
        assertThat(task.nthUglyNumber(10)).isEqualTo(12);
    }

    @Test
    void nthUglyNumberExample2() {
        assertThat(task.nthUglyNumber(1)).isEqualTo(1);
    }

    @Test
    void nthUglyNumberTC6() {
        assertThat(task.nthUglyNumber(11)).isEqualTo(15);
    }

    @Test
    void nthUglyNumberLinearComplexityExample1() {
        assertThat(taskLinearComplexity.nthUglyNumber(10)).isEqualTo(12);
    }

    @Test
    void nthUglyNumberLinearComplexityExample2() {
        assertThat(taskLinearComplexity.nthUglyNumber(1)).isEqualTo(1);
    }

    @Test
    void nthUglyNumberLinearComplexityTC6() {
        assertThat(taskLinearComplexity.nthUglyNumber(11)).isEqualTo(15);
    }
}