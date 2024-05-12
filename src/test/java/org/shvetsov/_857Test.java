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

    @Test
    void mincostToHireWorkers1() {
        assertThat(task.mincostToHireWorkers(new int[]{14, 56, 59, 89, 39, 26, 86, 76, 3, 36},
                new int[]{90, 217, 301, 202, 294, 445, 473, 245, 415, 487}, 2)).isCloseTo(399.53846, within(0.00001));
    }

    @Test
    void mincostToHireWorkers2() {
        assertThat(task.mincostToHireWorkers(new int[]{25, 68, 35, 62, 52, 57, 35, 83, 40, 51},
                new int[]{147, 97, 251, 129, 438, 443, 120, 366, 362, 343}, 6)).isCloseTo(1979.31429, within(0.00001));
    }
}