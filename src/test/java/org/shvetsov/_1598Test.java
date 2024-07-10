package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1598Test {

    private static _1598 task;

    @BeforeEach
    public void setup() {
        task = new _1598();
    }

    @Test
    void minOperationsExample1() {
        assertThat(task.minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"})).isEqualTo(2);
    }

    @Test
    void minOperationsExample2() {
        assertThat(task.minOperations(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"})).isEqualTo(3);
    }

    @Test
    void minOperationsExample3() {
        assertThat(task.minOperations(new String[]{"d1/", "../", "../", "../"})).isEqualTo(0);
    }
}