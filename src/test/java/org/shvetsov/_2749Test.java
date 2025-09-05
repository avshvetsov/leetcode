package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2749Test {

    private _2749 task;

    @BeforeEach
    public void setup() {
        this.task = new _2749();
    }

    @Test
    void makeTheIntegerZeroExample1() {
        assertThat(task.makeTheIntegerZero(3, -2)).isEqualTo(3);
    }

    @Test
    void makeTheIntegerZeroExample2() {
        assertThat(task.makeTheIntegerZero(5, 7)).isEqualTo(-1);
    }

    @Test
    void makeTheIntegerZeroTC532() {
        assertThat(task.makeTheIntegerZero(110, 55)).isEqualTo(-1);
    }

    @Test
    void makeTheIntegerZeroTC511() {
        assertThat(task.makeTheIntegerZero(112577768, -501662198)).isEqualTo(16);
    }

    @Test
    void makeTheIntegerZeroTC540() {
        assertThat(task.makeTheIntegerZero(135, 26)).isEqualTo(5);
    }
}