package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _796Test {

    private static _796 task;

    @BeforeEach
    public void setup() {
        task = new _796();
    }

    @Test
    void rotateStringExample1() {
        assertThat(task.rotateString("abcde", "cdeab")).isTrue();
    }

    @Test
    void rotateStringExample2() {
        assertThat(task.rotateString("abcde", "abced")).isFalse();
    }
}