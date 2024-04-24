package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1137Test {

    private static _1137 task;
    private static _1137.MemoRecursion taskMemoRecursion;

    @BeforeEach
    public void setup() {
        task = new _1137();
        taskMemoRecursion = new _1137.MemoRecursion();
    }

    @Test
    void tribonacci() {
        assertThat(task.tribonacci(4)).isEqualTo(4);
        assertThat(task.tribonacci(25)).isEqualTo(1389537);
    }

    @Test
    void tribonacciMemoRecursion() {
        assertThat(taskMemoRecursion.tribonacci(4)).isEqualTo(4);
        assertThat(taskMemoRecursion.tribonacci(25)).isEqualTo(1389537);
    }
}