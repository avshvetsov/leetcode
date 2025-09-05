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
}