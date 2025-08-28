package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3446Test {

    private static _3446 task;

    @BeforeEach
    public void setup() {
        task = new _3446();
    }

    @Test
    void sortMatrixExample1() {
        assertThat(task.sortMatrix(new int[][]{{1, 7, 3}, {9, 8, 2}, {4, 5, 6}})).isEqualTo(new int[][]{{8, 2, 3}, {9, 6, 7}, {4, 5, 1}});
    }

    @Test
    void sortMatrixExample2() {
        assertThat(task.sortMatrix(new int[][]{{0, 1}, {1, 2}})).isEqualTo(new int[][]{{2, 1}, {1, 0}});
    }

    @Test
    void sortMatrixExample3() {
        assertThat(task.sortMatrix(new int[][]{{1}})).isEqualTo(new int[][]{{1}});
    }
}