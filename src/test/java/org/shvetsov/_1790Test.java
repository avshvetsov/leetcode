package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1790Test {

    private static _1790 task;

    @BeforeEach
    public void setup() {
        task = new _1790();
    }

    @Test
    void areAlmostEqualExample1() {
        assertThat(task.areAlmostEqual("bank", "kanb")).isTrue();
    }
    @Test
    void areAlmostEqualExample2() {
        assertThat(task.areAlmostEqual("attack", "defend")).isFalse();
    }
    @Test
    void areAlmostEqualExample3() {
        assertThat(task.areAlmostEqual("kelb", "kelb")).isTrue();
    }
    @Test
    void areAlmostEqualCountingExample1() {
        assertThat(task.areAlmostEqualCounting("bank", "kanb")).isTrue();
    }
    @Test
    void areAlmostEqualCountingExample2() {
        assertThat(task.areAlmostEqualCounting("attack", "defend")).isFalse();
    }
    @Test
    void areAlmostEqualCountingExample3() {
        assertThat(task.areAlmostEqualCounting("kelb", "kelb")).isTrue();
    }

}