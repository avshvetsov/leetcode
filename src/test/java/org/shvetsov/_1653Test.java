package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1653Test {

    private static _1653 task;

    @BeforeEach
    public void setup() {
        task = new _1653();
    }

    @Test
    void minimumDeletionsExample1() {
        assertThat(task.minimumDeletions("aababbab")).isEqualTo(2);
    }

    @Test
    void minimumDeletionsExample2() {
        assertThat(task.minimumDeletions("bbaaaaabb")).isEqualTo(2);
    }
}