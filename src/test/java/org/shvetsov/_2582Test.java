package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2582Test {

    private static _2582 task;

    @BeforeEach
    public void setup() {
        task = new _2582();
    }

    @Test
    void passThePillowExample1() {
        assertThat(task.passThePillow(4, 5)).isEqualTo(2);
    }
    @Test
    void passThePillowExample2() {
        assertThat(task.passThePillow(3, 2)).isEqualTo(3);
    }
}