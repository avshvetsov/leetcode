package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2370Test {

    private static _2370 task;

    @BeforeEach
    public void setup() {
        task = new _2370();
    }

    @Test
    void longestIdealString() {
        assertThat(task.longestIdealString("acfgbd", 2)).isEqualTo(4);
        assertThat(task.longestIdealString("abcd", 3)).isEqualTo(4);
    }
}