package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _100292Test {

    private static _100292 task;

    @BeforeEach
    public void setup() {
        task = new _100292();
    }

    @Test
    void numberOfStableArrays() {
        assertThat(task.numberOfStableArrays(1, 1, 2)).isEqualTo(2);
        assertThat(task.numberOfStableArrays(1, 2, 1)).isEqualTo(1);
        assertThat(task.numberOfStableArrays(3, 3, 2)).isEqualTo(14);
    }
}