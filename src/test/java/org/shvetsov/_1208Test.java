package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1208Test {

    private static _1208 task;

    @BeforeEach
    public void setup() {
        task = new _1208();
    }

    @Test
    void equalSubstringExample1() {
        assertThat(task.equalSubstring("abcd", "bcdf", 3)).isEqualTo(3);
    }
    @Test
    void equalSubstringExample2() {
        assertThat(task.equalSubstring("abcd", "cdef", 3)).isEqualTo(1);
    }
    @Test
    void equalSubstringExample3() {
        assertThat(task.equalSubstring("abcd", "acde", 0)).isEqualTo(1);
    }
}