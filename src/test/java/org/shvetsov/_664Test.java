package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _664Test {

    private static _664 task;

    @BeforeEach
    public void setup() {
        task = new _664();
    }

    @Test
    void strangePrinterExample1() {
        assertThat(task.strangePrinter("aaabbb")).isEqualTo(2);
    }

    @Test
    void strangePrinterExample2() {
        assertThat(task.strangePrinter("aba")).isEqualTo(2);
    }
}