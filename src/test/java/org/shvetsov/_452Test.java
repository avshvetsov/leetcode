package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _452Test {

    private _452 task;

    @BeforeEach
    public void setup() {
        task = new _452();
    }

    @Test
    void findMinArrowShots() {
        assertThat(task.findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}})).isEqualTo(2);
        assertThat(task.findMinArrowShots(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}})).isEqualTo(4);
        assertThat(task.findMinArrowShots(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}})).isEqualTo(2);
    }
}