package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1653Test {

    private static _1653 task;
    private static _1653.WithStack taskWithStack;

    @BeforeEach
    public void setup() {
        task = new _1653();
        taskWithStack = new _1653.WithStack();
    }

    @Test
    void minimumDeletionsExample1() {
        assertThat(task.minimumDeletions("aababbab")).isEqualTo(2);
    }

    @Test
    void minimumDeletionsExample2() {
        assertThat(task.minimumDeletions("bbaaaaabb")).isEqualTo(2);
    }

    @Test
    void minimumDeletionsWithStackExample1() {
        assertThat(taskWithStack.minimumDeletions("aababbab")).isEqualTo(2);
    }

    @Test
    void minimumDeletionsWithStackExample2() {
        assertThat(taskWithStack.minimumDeletions("bbaaaaabb")).isEqualTo(2);
    }
}