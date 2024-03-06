package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _66Test {

    private static _66 task;

    @BeforeEach
    public void setup() {
        task = new _66();
    }

    @Test
    void plusOne() {
        assertThat(task.plusOne(new int[]{1, 2, 3})).containsExactly(1, 2, 4);
        assertThat(task.plusOne(new int[]{4, 3, 2, 1})).containsExactly(4, 3, 2, 2);
        assertThat(task.plusOne(new int[]{9})).containsExactly(1, 0);
        assertThat(task.plusOne(new int[]{9, 9, 9})).containsExactly(1, 0, 0, 0);
    }
}