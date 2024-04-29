package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2997Test {

    private static _2997 task;

    @BeforeEach
    public void setup() {
        task = new _2997();
    }

    @Test
    void minOperations() {
        assertThat(task.minOperations(new int[]{2, 1, 3, 4}, 1)).isEqualTo(2);
        assertThat(task.minOperations(new int[]{2, 0, 2, 0}, 0)).isEqualTo(0);
    }
}