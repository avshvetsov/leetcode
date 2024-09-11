package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2220Test {

    private static _2220 task;

    @BeforeEach
    public void setup() {
        task = new _2220();
    }

    @Test
    void minBitFlipsExample1() {
        assertThat(task.minBitFlips(10, 7)).isEqualTo(3);
    }

    @Test
    void minBitFlipsExample2() {
        assertThat(task.minBitFlips(3, 4)).isEqualTo(3);
    }
}