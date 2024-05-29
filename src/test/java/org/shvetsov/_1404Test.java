package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1404Test {

    private static _1404 task;

    @BeforeEach
    public void setup() {
        task = new _1404();
    }

    @Test
    void numStepsExample1() {
        assertThat(task.numSteps("1101")).isEqualTo(6);
    }
    @Test
    void numStepsExample2() {
        assertThat(task.numSteps("10")).isEqualTo(1);
    }
    @Test
    void numStepsExample3() {
        assertThat(task.numSteps("1")).isEqualTo(0);
    }
}