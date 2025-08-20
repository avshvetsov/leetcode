package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1277Test {

    private static _1277 task;

    @BeforeEach
    public void setup() {
        task = new _1277();
    }

    @Test
    void countSquaresExample1() {
        assertThat(task.countSquares(new int[][]{
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        })).isEqualTo(15);
    }

    @Test
    void countSquaresExample2() {
        assertThat(task.countSquares(new int[][]{
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 0}
        })).isEqualTo(7);
    }
}