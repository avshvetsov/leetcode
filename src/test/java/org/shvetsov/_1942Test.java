package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1942Test {

    private static _1942 task;

    @BeforeEach
    public void setup() {
        task = new _1942();
    }

    @Test
    void smallestChairExample1() {
        assertThat(task.smallestChair(new int[][]{{1, 4}, {2, 3}, {4, 6}}, 1)).isEqualTo(1);
    }

    @Test
    void smallestChairExample2() {
        assertThat(task.smallestChair(new int[][]{{3, 10}, {1, 5}, {2, 6}}, 0)).isEqualTo(2);
    }
}