package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1438Test {

    private static _1438 task;

    @BeforeEach
    public void setup() {
        task = new _1438();
    }

    @Test
    void longestSubarrayExample1() {
        assertThat(task.longestSubarray(new int[]{8, 2, 4, 7}, 4)).isEqualTo(2);
    }

    @Test
    void longestSubarrayExample2() {
        assertThat(task.longestSubarray(new int[]{10, 1, 2, 4, 7, 2}, 5)).isEqualTo(4);
    }

    @Test
    void longestSubarrayExample3() {
        assertThat(task.longestSubarray(new int[]{4, 2, 2, 2, 4, 4, 2, 2}, 0)).isEqualTo(3);
    }
}