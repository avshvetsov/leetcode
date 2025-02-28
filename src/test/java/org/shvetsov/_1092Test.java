package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1092Test {

    private _1092 task;

    @BeforeEach
    public void setup() {
        task = new _1092();
    }

    @Test
    void shortestCommonSupersequenceExample1() {
        assertThat(task.shortestCommonSupersequence("abac", "cab")).isEqualTo("cabac");
    }

    @Test
    void shortestCommonSupersequenceExample2() {
        assertThat(task.shortestCommonSupersequence("aaaaaaaa", "aaaaaaaa")).isEqualTo("aaaaaaaa");
    }

    @Test
    void shortestCommonSupersequenceTC12() {
        assertThat(task.shortestCommonSupersequence("bbbaaaba", "bbababbb")).isEqualTo("bbbaaababbb");
    }

}