package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3110Test {

    private static _3110 task;

    @BeforeEach
    public void setup() {
        task = new _3110();
    }

    @Test
    void scoreOfStringExample1() {
        assertThat(task.scoreOfString("hello")).isEqualTo(13);
    }

    @Test
    void scoreOfStringExample2() {
        assertThat(task.scoreOfString("zaz")).isEqualTo(50);
    }
}