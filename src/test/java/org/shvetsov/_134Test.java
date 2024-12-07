package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _134Test {

    private static _134 task;

    @BeforeEach
    public void setup() {
        task = new _134();
    }

    @Test
    void canCompleteCircuitExample1() {
        assertThat(task.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2})).isEqualTo(3);
    }

    @Test
    void canCompleteCircuitExample2() {
        assertThat(task.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3})).isEqualTo(-1);
    }
}