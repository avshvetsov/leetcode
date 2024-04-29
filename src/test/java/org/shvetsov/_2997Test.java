package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2997Test {

    private static _2997 task;
    private static _2997.BitOperations taskBitOperations;

    @BeforeEach
    public void setup() {
        task = new _2997();
        taskBitOperations = new _2997.BitOperations();
    }

    @Test
    void minOperations() {
        assertThat(task.minOperations(new int[]{2, 1, 3, 4}, 1)).isEqualTo(2);
        assertThat(task.minOperations(new int[]{2, 0, 2, 0}, 0)).isEqualTo(0);
    }

    @Test
    void minOperationsBitOperations() {
        assertThat(taskBitOperations.minOperations(new int[]{2, 1, 3, 4}, 1)).isEqualTo(2);
        assertThat(taskBitOperations.minOperations(new int[]{2, 0, 2, 0}, 0)).isEqualTo(0);
    }
}