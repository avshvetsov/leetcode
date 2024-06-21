package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1052Test {

    private static _1052 task;

    @BeforeEach
    public void setup() {
        task = new _1052();
    }

    @Test
    void maxSatisfiedExample1() {
        assertThat(task.maxSatisfied(new int[]{1, 0, 1, 2, 1, 1, 7, 5}, new int[]{0, 1, 0, 1, 0, 1, 0, 1}, 3)).isEqualTo(16);
    }

    @Test
    void maxSatisfiedExample2() {
        assertThat(task.maxSatisfied(new int[]{1}, new int[]{0}, 1)).isEqualTo(1);
    }
}