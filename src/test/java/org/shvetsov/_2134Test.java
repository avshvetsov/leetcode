package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2134Test {

    private static _2134 task;

    @BeforeEach
    public void setup() {
        task = new _2134();
    }

    @Test
    void minSwapsExample1() {
        assertThat(task.minSwaps(new int[]{0, 1, 0, 1, 1, 0, 0})).isEqualTo(1);
    }

    @Test
    void minSwapsExample2() {
        assertThat(task.minSwaps(new int[]{0, 1, 1, 1, 0, 0, 1, 1, 0})).isEqualTo(2);
    }

    @Test
    void minSwapsExample3() {
        assertThat(task.minSwaps(new int[]{1, 1, 0, 0, 1})).isEqualTo(0);
    }
}