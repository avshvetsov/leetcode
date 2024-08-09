package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _840Test {

    private static _840 task;

    @BeforeEach
    public void setup() {
        task = new _840();
    }

    @Test
    void numMagicSquaresInsideExample1() {
        assertThat(task.numMagicSquaresInside(new int[][]{{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}})).isEqualTo(1);
    }

    @Test
    void numMagicSquaresInsideExample2() {
        assertThat(task.numMagicSquaresInside(new int[][]{{8}})).isEqualTo(0);
    }

    @Test
    void numMagicSquaresInsideTC59() {
        assertThat(task.numMagicSquaresInside(new int[][]{{10, 3, 5}, {1, 6, 11}, {7, 9, 2}})).isEqualTo(0);
    }

    @Test
    void numMagicSquaresInsideTC77() {
        assertThat(task.numMagicSquaresInside(new int[][]{{3, 2, 9, 2, 7}, {6, 1, 8, 4, 2}, {7, 5, 3, 2, 7}, {2, 9, 4, 9, 6}, {4, 3, 8, 2, 5}})).isEqualTo(1);
    }
}