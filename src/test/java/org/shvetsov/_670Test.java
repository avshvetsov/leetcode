package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class _670Test {

    private static _670 task;
    private static _670.NotOptimal taskNotOptimal;

    @BeforeEach
    public void setup() {
        task = new _670();
        taskNotOptimal = new _670.NotOptimal();
    }

    @Test
    void maximumSwapExample1() {
        assertThat(task.maximumSwap(2736)).isEqualTo(7236);
    }

    @Test
    void maximumSwapExample2() {
        assertThat(task.maximumSwap(9973)).isEqualTo(9973);
    }

    @Test
    void maximumSwapTC105() {
        assertThat(task.maximumSwap(98368)).isEqualTo(98863);
    }

    @Test
    void maximumSwapNotOptimalExample1() {
        assertThat(taskNotOptimal.maximumSwap(2736)).isEqualTo(7236);
    }

    @Test
    void maximumSwapNotOptimalExample2() {
        assertThat(taskNotOptimal.maximumSwap(9973)).isEqualTo(9973);
    }

    @Test
    void maximumSwapNotOptimalTC105() {
        assertThat(taskNotOptimal.maximumSwap(98368)).isEqualTo(98863);
    }
}