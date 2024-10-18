package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2044Test {

    private static _2044 task;

    @BeforeEach
    public void setup() {
        task = new _2044();
    }

    @Test
    void countMaxOrSubsetsExample1() {
        assertThat(task.countMaxOrSubsets(new int[]{3, 1})).isEqualTo(2);
    }

    @Test
    void countMaxOrSubsetsExample2() {
        assertThat(task.countMaxOrSubsets(new int[]{2, 2, 2})).isEqualTo(7);
    }

    @Test
    void countMaxOrSubsetsExample3() {
        assertThat(task.countMaxOrSubsets(new int[]{3, 2, 1, 5})).isEqualTo(6);
    }
}