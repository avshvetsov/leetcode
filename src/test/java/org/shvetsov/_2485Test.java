package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2485Test {

    private static _2485 task;

    @BeforeEach
    public void setup() {
        task = new _2485();
    }
    @Test
    void pivotInteger() {
        assertThat(task.pivotInteger(8)).isEqualTo(6);
        assertThat(task.pivotInteger(1)).isEqualTo(1);
        assertThat(task.pivotInteger(4)).isEqualTo(-1);
    }
}