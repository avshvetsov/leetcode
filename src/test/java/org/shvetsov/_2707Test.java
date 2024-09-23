package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2707Test {

    private static _2707 task;

    @BeforeEach
    public void setup() {
        task = new _2707();
    }

    @Test
    void minExtraCharExample1() {
        assertThat(task.minExtraChar("leetscode", new String[]{"leet", "code", "leetcode"})).isEqualTo(1);
    }

    @Test
    void minExtraCharExample2() {
        assertThat(task.minExtraChar("sayhelloworld", new String[]{"hello", "world"})).isEqualTo(3);
    }
}