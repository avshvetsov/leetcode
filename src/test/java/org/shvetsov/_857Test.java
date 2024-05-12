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

    @Test
    void mincostToHireWorkers3() {
        assertThat(task.mincostToHireWorkers(new int[]{32, 43, 66, 9, 94, 57, 25, 44, 99, 19},
                new int[]{187, 366, 117, 363, 121, 494, 348, 382, 385, 262}, 4)).isCloseTo(1528.00000, within(0.00001));
    }

    @Test
    void mincostToHireWorkers4() {
        assertThat(task.mincostToHireWorkers(new int[]{37, 32, 14, 14, 23, 31, 82, 96, 81, 96, 22, 17, 68, 3, 88, 59, 54, 23, 22, 77, 61, 16, 46, 22, 94, 50, 29, 46, 7, 33, 22, 99, 31, 99, 75, 67, 95, 54, 31, 48, 44, 96, 99, 20, 51, 54, 18, 85, 25, 84},
                new int[]{453, 236, 199, 359, 107, 45, 150, 433, 32, 192, 433, 94, 113, 200, 293, 31, 48, 27, 15, 32, 295, 97, 199, 427, 90, 215, 390, 412, 475, 131, 122, 398, 479, 142, 103, 243, 86, 309, 498, 210, 173, 363, 449, 135, 353, 397, 105, 165, 165, 62}, 20)).isCloseTo(4947.75000, within(0.00001));
    }
}