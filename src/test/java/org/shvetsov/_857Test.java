package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class _857Test {

    private static _857 task;

    @BeforeEach
    public void setup() {
        task = new _857();
    }

    @Test
    void mincostToHireWorkers() {
        assertThat(task.mincostToHireWorkers(new int[]{10, 20, 5}, new int[]{70, 50, 30}, 2)).isCloseTo(105, within(0.00001));
        assertThat(task.mincostToHireWorkers(new int[]{3, 1, 10, 10, 1}, new int[]{4, 8, 2, 2, 7}, 3)).isCloseTo(30.66667, within(0.00001));
    }
}