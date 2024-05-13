package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _861Test {

    private static _861 task;

    @BeforeEach
    public void setup() {
        task = new _861();
    }

    @Test
    void matrixScore() {
        assertThat(task.matrixScore(new int[][]{{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}})).isEqualTo(39);
        assertThat(task.matrixScore(new int[][]{{0}})).isEqualTo(1);
    }

    @Test
    void matrixScore1() {
        assertThat(task.matrixScore(new int[][]{{0, 1}, {1, 1}})).isEqualTo(5);

    }
}