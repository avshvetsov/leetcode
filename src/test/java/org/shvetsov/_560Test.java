package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _560Test {

    private static _560 task;

    @BeforeEach
    public void setup() {
        task = new _560();
    }

    @Test
    void subarraySumExample1() {
        assertThat(task.subarraySum(new int[]{1, 1, 1}, 2)).isEqualTo(2);
    }
    @Test
    void subarraySumExample2() {
        assertThat(task.subarraySum(new int[]{1, 2, 3}, 3)).isEqualTo(2);
    }
}