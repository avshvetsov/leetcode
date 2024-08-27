package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1514Test {

    private static _1514 task;

    @BeforeEach
    public void setup() {
        task = new _1514();
    }

    @Test
    void maxProbabilityExample1() {
        assertThat(task.maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.2}, 0, 2))
                .isEqualTo(0.25);
    }

    @Test
    void maxProbabilityExample2() {
        assertThat(task.maxProbability(3, new int[][]{{0,1}}, new double[]{0.5}, 0, 2))
                .isEqualTo(0);
    }

    @Test
    void maxProbabilityExample3() {
        assertThat(task.maxProbability(3, new int[][]{{0,1},{1,2},{0,2}}, new double[]{0.5,0.5,0.3}, 0, 2))
                .isEqualTo(0.3);
    }
}