package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _41Test {

    private static _41 task;

    @BeforeEach
    public void setup() {
        task = new _41();
    }

    @Test
    void firstMissingPositive() {
        assertThat(task.firstMissingPositive(new int[]{1, 2, 0})).isEqualTo(3);
        assertThat(task.firstMissingPositive(new int[]{3, 4, -1, 1})).isEqualTo(2);
        assertThat(task.firstMissingPositive(new int[]{7, 8, 9, 11, 12})).isEqualTo(1);
    }
}