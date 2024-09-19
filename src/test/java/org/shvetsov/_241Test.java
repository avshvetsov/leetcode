package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _241Test {

    private static _241 task;

    @BeforeEach
    public void setup() {
        task = new _241();
    }

    @Test
    void diffWaysToComputeExample1() {
        assertThat(task.diffWaysToCompute("2-1-1")).containsExactlyInAnyOrder(0, 2);
    }

    @Test
    void diffWaysToComputeExample2() {
        assertThat(task.diffWaysToCompute("2*3-4*5")).containsExactlyInAnyOrder(-34, -14, -10, -10, 10);
    }
}