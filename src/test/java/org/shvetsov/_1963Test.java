package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1963Test {

    private static _1963 task;

    @BeforeEach
    public void setup() {
        task = new _1963();
    }

    @Test
    void minSwapsExample1() {
        assertThat(task.minSwaps("][][")).isEqualTo(1);
    }
    @Test
    void minSwapsExample2() {
        assertThat(task.minSwaps("]]][[[")).isEqualTo(2);
    }
    @Test
    void minSwapsExample3() {
        assertThat(task.minSwaps("[]")).isEqualTo(0);
    }
}