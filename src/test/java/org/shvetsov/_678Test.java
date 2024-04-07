package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _678Test {

    private static _678 task;

    @BeforeEach
    public void setup() {
        task = new _678();
    }
    @Test
    void checkValidString() {
        assertThat(task.checkValidString("()")).isTrue();
        assertThat(task.checkValidString("(*)")).isTrue();
        assertThat(task.checkValidString("(*))")).isTrue();
    }
}