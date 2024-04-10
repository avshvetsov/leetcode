package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1700Test {

    private static _1700 task;

    @BeforeEach
    public void setup() {
        task = new _1700();
    }

    @Test
    void countStudents() {
        assertThat(task.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1})).isEqualTo(0);
        assertThat(task.countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1})).isEqualTo(3);
    }
}