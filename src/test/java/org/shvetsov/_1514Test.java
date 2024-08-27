package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class _1514Test {

    private static _1514 task;

    @BeforeEach
    public void setup() {
        task = new _1514();
    }

    @Test
    void maxProbabilityExample1() {
        assertThat(task.maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.2}, 0, 2))
                .isCloseTo(0.25, within(0.00001));
    }

    @Test
    void maxProbabilityExample2() {
        assertThat(task.maxProbability(3, new int[][]{{0,1}}, new double[]{0.5}, 0, 2))
                .isCloseTo(0, within(0.00001));
    }

    @Test
    void maxProbabilityExample3() {
        assertThat(task.maxProbability(3, new int[][]{{0,1},{1,2},{0,2}}, new double[]{0.5,0.5,0.3}, 0, 2))
                .isCloseTo(0.3, within(0.00001));
    }
    
    @Test
    void maxProbabilityTC7() {
        assertThat(task.maxProbability(5, new int[][]{{2,3},{1,2},{3,4},{1,3},{1,4},{0,1},{2,4},{0,4},{0,2}}, new double[]{0.06,0.26,0.49,0.25,0.2,0.64,0.23,0.21,0.77}, 0, 3))
                .isCloseTo(0.16000, within(0.00001));
    }
}