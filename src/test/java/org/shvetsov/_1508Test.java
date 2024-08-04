package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1508Test {

    private static _1508 task;

    @BeforeEach
    public void setup() {
        task = new _1508();
    }

    @Test
    void rangeSumExample1() {
        assertThat(task.rangeSum(new int[]{1, 2, 3, 4}, 4, 1, 5)).isEqualTo(13);
    }

    @Test
    void rangeSumExample2() {
        assertThat(task.rangeSum(new int[]{1, 2, 3, 4}, 4, 3, 4)).isEqualTo(6);
    }

    @Test
    void rangeSumExample3() {
        assertThat(task.rangeSum(new int[]{1, 2, 3, 4}, 4, 1, 10)).isEqualTo(50);
    }
}