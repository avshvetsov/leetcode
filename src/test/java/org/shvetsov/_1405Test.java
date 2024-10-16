package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1405Test {

    private static _1405 task;

    @BeforeEach
    public void setup() {
        task = new _1405();
    }

    @Test
    void longestDiverseStringExample1() {
        assertThat(task.longestDiverseString(1, 1, 7)).isIn("ccaccbcc", "ccbccacc");
    }

    @Test
    void longestDiverseStringExample2() {
        assertThat(task.longestDiverseString(7, 1, 0)).isEqualTo("aabaa");
    }
}