package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1992Test {

    private static _1992 task;

    @BeforeEach
    public void setup() {
        task = new _1992();
    }

    @Test
    void findFarmland() {
        assertThat(task.findFarmland(new int[][]{{1, 0, 0}, {0, 1, 1}, {0, 1, 1}})).isEqualTo(new int[][]{{0, 0, 0, 0}, {1, 1, 2, 2}});
        assertThat(task.findFarmland(new int[][]{{1, 1}, {1, 1}})).isEqualTo(new int[][]{{0, 0, 1, 1}});
        assertThat(task.findFarmland(new int[][]{{0}})).isEqualTo(new int[][]{});
    }
}