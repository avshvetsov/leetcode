package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _165Test {

    private static _165 task;

    @BeforeEach
    public void setup() {
        task = new _165();
    }

    @Test
    void compareVersion() {
        assertThat(task.compareVersion("1.01", "1.001")).isZero();
        assertThat(task.compareVersion("1.0", "1.0.0")).isZero();
        assertThat(task.compareVersion("0.1", "1.1")).isEqualTo(-1);
    }
}