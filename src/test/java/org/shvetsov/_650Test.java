package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _650Test {

    private static _650 task;

    @BeforeEach
    public void setup() {
        task = new _650();
    }

    @Test
    void minStepsExample1() {
        assertThat(task.minSteps(3)).isEqualTo(3);
    }

    @Test
    void minStepsExample2() {
        assertThat(task.minSteps(1)).isEqualTo(0);
    }
}