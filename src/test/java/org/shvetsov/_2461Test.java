package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2461Test {

    private static _2461 task;

    @BeforeEach
    public void setup() {
        task = new _2461();
    }

    @Test
    void maximumSubarraySumExample1() {
        assertThat(task.maximumSubarraySum(new int[]{1, 5, 4, 2, 9, 9, 9}, 3)).isEqualTo(15);
    }

    @Test
    void maximumSubarraySumExample2() {
        assertThat(task.maximumSubarraySum(new int[]{4, 4, 4}, 3)).isEqualTo(0);
    }

}