package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1863Test {

    private static _1863 task;

    @BeforeEach
    public void setup() {
        task = new _1863();
    }

    @Test
    void subsetXORSumExample1() {
        assertThat(task.subsetXORSum(new int[]{1, 3})).isEqualTo(6);
    }

    @Test
    void subsetXORSumExample2() {
        assertThat(task.subsetXORSum(new int[]{5, 1, 6})).isEqualTo(28);
    }

    @Test
    void subsetXORSumExample3() {
        assertThat(task.subsetXORSum(new int[]{3, 4, 5, 6, 7, 8})).isEqualTo(480);
    }
}