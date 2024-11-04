package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3163Test {

    private static _3163 task;

    @BeforeEach
    public void setup() {
        task = new _3163();
    }

    @Test
    void compressedStringExample1() {
        assertThat(task.compressedString("abcde")).isEqualTo("1a1b1c1d1e");
    }
    @Test
    void compressedStringExample2() {
        assertThat(task.compressedString("aaaaaaaaaaaaaabb")).isEqualTo("9a5a2b");
    }
}