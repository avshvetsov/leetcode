package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _826Test {

    private static _826 task;

    @BeforeEach
    public void setup() {
        task = new _826();
    }

    @Test
    void maxProfitAssignmentExample1() {
        assertThat(task.maxProfitAssignment(new int[]{2, 4, 6, 8, 10}, new int[]{10, 20, 30, 40, 50}, new int[]{4, 5, 6, 7}))
                .isEqualTo(100);
    }

    @Test
    void maxProfitAssignmentExample2() {
        assertThat(task.maxProfitAssignment(new int[]{85, 47, 57}, new int[]{24, 66, 99}, new int[]{40, 25, 25}))
                .isEqualTo(0);
    }
}