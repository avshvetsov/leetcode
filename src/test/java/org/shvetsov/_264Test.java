package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _264Test {

    private static _264 task;

    @BeforeEach
    public void setup() {
        task = new _264();
    }

    @Test
    void nthUglyNumberExample1() {
        assertThat(task.nthUglyNumber(10)).isEqualTo(12);
    }

    @Test
    void nthUglyNumberExample2() {
        assertThat(task.nthUglyNumber(1)).isEqualTo(1);
    }
}