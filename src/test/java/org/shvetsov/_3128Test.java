package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _3128Test {

    private static _3128 task;

    @BeforeEach
    public void setup() {
        task = new _3128();
    }

    @Test
    void numberOfRightTriangles() {
        assertThat(task.numberOfRightTriangles(new int[][]{{0, 1, 0}, {0, 1, 1}, {0, 1, 0}})).isEqualTo(2);
        assertThat(task.numberOfRightTriangles(new int[][]{{1, 0, 0, 0}, {0, 1, 0, 1}, {1, 0, 0, 0}})).isEqualTo(0);
        assertThat(task.numberOfRightTriangles(new int[][]{{1, 0, 1}, {1, 0, 0}, {1, 0, 0}})).isEqualTo(2);
    }
}