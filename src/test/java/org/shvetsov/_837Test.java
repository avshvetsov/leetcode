package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

class _837Test {

    private static _837 task;

    @BeforeEach
    public void setup() {
        task = new _837();
    }

    @Test
    void new21GameExample1() {
        assertThat(task.new21Game(10, 1, 10)).isCloseTo(1.0, offset(0.00001));
    }
    @Test
    void new21GameExample2() {
        assertThat(task.new21Game(6, 1, 10)).isCloseTo(0.6, offset(0.00001));
    }
    @Test
    void new21GameExample3() {
        assertThat(task.new21Game(21, 17, 10)).isCloseTo(0.73278, offset(0.00001));
    }
    @Test
    void new21GameTC150() {
        assertThat(task.new21Game(0, 0, 1)).isCloseTo(1, offset(0.00001));
    }
    @Test
    void new21GameTC127() {
        assertThat(task.new21Game(1, 0, 1)).isCloseTo(1, offset(0.00001));
    }
    @Test
    void new21GameTC136() {
        assertThat(task.new21Game(1, 0, 2)).isCloseTo(1, offset(0.00001));
    }
    @Test
    void new21GameTC149() {
        assertThat(task.new21Game(12, 1, 10)).isCloseTo(1, offset(0.00001));
    }
}