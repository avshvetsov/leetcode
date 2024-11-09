package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3133Test {

    private static _3133 task;

    @BeforeEach
    public void setup() {
        task = new _3133();
    }

    @Test
    void minEndExample1() {
        assertThat(task.minEnd(3, 4)).isEqualTo(6);
    }

    @Test
    void minEndExample2() {
        assertThat(task.minEnd(2, 7)).isEqualTo(15);
    }

    @Test
    void minEndTC76() {
        assertThat(task.minEnd(4, 1)).isEqualTo(7);
    }
}