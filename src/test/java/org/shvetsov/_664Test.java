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

    @Test
    void strangePrinterTC25() {
        assertThat(task.strangePrinter("abcabc")).isEqualTo(5);
    }

    @Test
    void strangePrinterTC41() {
        assertThat(task.strangePrinter("abababac")).isEqualTo(5);
    }

    @Test
    void strangePrinterTC51() {
        assertThat(task.strangePrinter("baacdddaaddaaaaccbddbcabdaabdbbcdcbbbacbddcabcaaa")).isEqualTo(19);
    }

    @Test
    void strangePrinterTC53() {
        assertThat(task.strangePrinter("abcabcabc")).isEqualTo(7);
    }

    @Test
    void strangePrinterTC58() {
        assertThat(task.strangePrinter("tbgtgb")).isEqualTo(4);
    }

    @Test
    void strangePrinterTC152() {
        assertThat(task.strangePrinter("ddbbababdbccadcccbbbacaddcaacdbcddcddddacaadcabd")).isEqualTo(19);
    }
}