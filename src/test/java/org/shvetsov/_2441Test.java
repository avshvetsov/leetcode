package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2441Test {

    private static _2441 task;

    @BeforeEach
    public void setup() {
        task = new _2441();
    }

    @Test
    void findMaxK() {
        assertThat(task.findMaxK(new int[]{-1, 2, -3, 3})).isEqualTo(3);
        assertThat(task.findMaxK(new int[]{-1, 10, 6, 7, -7, 1})).isEqualTo(7);
        assertThat(task.findMaxK(new int[]{-10, 8, 6, 7, -2, -3})).isEqualTo(-1);
    }
}