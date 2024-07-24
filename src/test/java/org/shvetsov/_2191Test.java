package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2191Test {

    private static _2191 task;

    @BeforeEach
    public void setup() {
        task = new _2191();
    }

    @Test
    void sortJumbledExample1() {
        assertThat(task.sortJumbled(new int[]{8, 9, 4, 0, 2, 1, 3, 5, 7, 6}, new int[]{991, 338, 38}))
                .isEqualTo(new int[]{338, 38, 991});
    }

    @Test
    void sortJumbledExample2() {
        assertThat(task.sortJumbled(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{789, 456, 123}))
                .isEqualTo(new int[]{123, 456, 789});
    }
}