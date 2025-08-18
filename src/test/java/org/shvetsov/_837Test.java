package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _837Test {

    private static _837 task;

    @BeforeEach
    public void setup() {
        task = new _837();
    }

    @Test
    void new21GameExample1() {
        assertThat(task.new21Game(10, 1, 10)).isEqualTo(1.0);
    }
    @Test
    void new21GameExample2() {
        assertThat(task.new21Game(6, 1, 10)).isEqualTo(0.6);
    }
    @Test
    void new21GameExample3() {
        assertThat(task.new21Game(21, 17, 10)).isEqualTo(0.73278);
    }
}