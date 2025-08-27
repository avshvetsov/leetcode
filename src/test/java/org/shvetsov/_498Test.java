package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _498Test {

    private static _498 task;

    @BeforeEach
    public void setup() {
        task = new _498();
    }

    @Test
    void findDiagonalOrderExample1() {
        assertThat(task.findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})).isEqualTo(new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9});
    }

    @Test
    void findDiagonalOrderExample2() {
        assertThat(task.findDiagonalOrder(new int[][]{{1, 2}, {3, 4}})).isEqualTo(new int[]{1, 2, 3, 4});
    }
}