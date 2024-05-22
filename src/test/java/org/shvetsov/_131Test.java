package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _131Test {

    private static _131 task;

    @BeforeEach
    public void setup() {
        task = new _131();
    }

    @Test
    void partitionExample1() {
        assertThat(task.partition("aab")).containsExactlyInAnyOrderElementsOf(List.of(List.of("a", "a", "b"), List.of("aa", "b")));
    }

    @Test
    void partitionExample2() {
        assertThat(task.partition("a")).containsExactlyInAnyOrderElementsOf(List.of(List.of("a")));
    }
}