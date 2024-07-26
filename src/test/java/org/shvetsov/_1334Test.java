package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1334Test {

    private static _1334 task;

    @BeforeEach
    public void setup() {
        task = new _1334();
    }

    @Test
    void findTheCityExample1() {
        assertThat(task.findTheCity(4, new int[][]{{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}}, 4)).isEqualTo(3);
    }

    @Test
    void findTheCityExample2() {
        assertThat(task.findTheCity(5, new int[][]{{0, 1, 2}, {0, 4, 8}, {1, 2, 3}, {1, 4, 2}, {2, 3, 1}, {3, 4, 1}}, 2)).isEqualTo(0);
    }
}