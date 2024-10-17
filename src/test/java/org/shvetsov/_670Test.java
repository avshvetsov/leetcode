package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class _670Test {

    private static _670 task;

    @BeforeEach
    public void setup() {
        task = new _670();
    }

    @Test
    void maximumSwapExample1() {
        assertThat(task.maximumSwap(2736)).isEqualTo(7236);
    }

    @Test
    void maximumSwapExample2() {
        assertThat(task.maximumSwap(9973)).isEqualTo(9973);
    }
}