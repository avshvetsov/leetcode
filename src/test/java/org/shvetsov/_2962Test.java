package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2962Test {

    private static _2962 task;

    @BeforeEach
    public void setup() {
        task = new _2962();
    }

    @Test
    void countSubarrays() {
        assertThat(task.countSubarrays(new int[]{1, 3, 2, 3, 3}, 2)).isEqualTo(6);
        assertThat(task.countSubarrays(new int[]{1, 4, 2, 1}, 3)).isEqualTo(0);
    }
}