package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2530Test {

    private static _2530 task;

    @BeforeEach
    public void setup() {
        task = new _2530();
    }

    @Test
    void maxKelementsExample1() {
        assertThat(task.maxKelements(new int[]{10, 10, 10, 10, 10}, 5)).isEqualTo(50);
    }

    @Test
    void maxKelementsExample2() {
        assertThat(task.maxKelements(new int[]{1, 10, 3, 3, 3}, 3)).isEqualTo(17);
    }
}