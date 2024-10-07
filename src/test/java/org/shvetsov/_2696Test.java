package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2696Test {

    private static _2696 task;

    @BeforeEach
    public void setup() {
        task = new _2696();
    }

    @Test
    void minLengthExample1() {
        assertThat(task.minLength("ABFCACDB")).isEqualTo(2);
    }

    @Test
    void minLengthExample2() {
        assertThat(task.minLength("ACBBD")).isEqualTo(5);
    }
}