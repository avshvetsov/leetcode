package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _857Test {

    private static _857 task;

    @BeforeEach
    public void setup() {
        task = new _857();
    }

    @Test
    void mincostToHireWorkers() {
        assertThat(task.mincostToHireWorkers(new int[]{10, 20, 5}, new int[]{70, 50, 30}, 2)).isEqualTo(105);
        assertThat(task.mincostToHireWorkers(new int[]{3, 1, 10, 10, 1}, new int[]{4, 8, 2, 2, 7}, 3)).isEqualTo(30.66667);
    }
}