package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3403Test {

    private static _3403 task;

    @BeforeEach
    public void setup() {
        task = new _3403();
    }

    @Test
    void answerStringExample1() {
        assertThat(task.answerString("dbca", 2)).isEqualTo("dbc");
    }

    @Test
    void answerStringExample2() {
        assertThat(task.answerString("gggg", 4)).isEqualTo("g");
    }

    @Test
    void answerStringTCMy1() {
        assertThat(task.answerString("cacbf", 4)).isEqualTo("f");
    }
}