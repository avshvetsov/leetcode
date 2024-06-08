package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _523Test {

    private static _523 task;

    @BeforeEach
    public void setup() {
        task = new _523();
    }

    @Test
    void checkSubarraySumExample1() {
        assertThat(task.checkSubarraySum(new int[]{23,2,4,6,7}, 6)).isTrue();
    }
    @Test
    void checkSubarraySumExample2() {
        assertThat(task.checkSubarraySum(new int[]{23,2,6,4,7}, 6)).isTrue();
    }
    @Test
    void checkSubarraySumExample3() {
        assertThat(task.checkSubarraySum(new int[]{23,2,6,4,7}, 13)).isFalse();
    }
}