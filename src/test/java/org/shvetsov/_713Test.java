package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _713Test {

    private static _713 task;

    @BeforeEach
    public void setup() {
        task = new _713();
    }

    @Test
    void numSubarrayProductLessThanK() {
        assertThat(task.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100)).isEqualTo(8);
        assertThat(task.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0)).isEqualTo(0);
    }
}