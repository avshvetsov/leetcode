package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _947Test {

    private static _947 task;
    private static _947.MapSolution taskMapSolution;

    @BeforeEach
    public void setup() {
        task = new _947();
        taskMapSolution = new _947.MapSolution();
    }

    @Test
    @Disabled
    void removeStonesExample1() {
        assertThat(task.removeStones(new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}})).isEqualTo(5);
    }

    @Test
    @Disabled
    void removeStonesExample2() {
        assertThat(task.removeStones(new int[][]{{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}})).isEqualTo(3);
    }

    @Test
    @Disabled
    void removeStonesExample3() {
        assertThat(task.removeStones(new int[][]{{0, 0}})).isEqualTo(0);
    }

    @Test
    void removeStonesMapSolutionExample1() {
        assertThat(taskMapSolution.removeStones(new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}})).isEqualTo(5);
    }

    @Test
    void removeStonesMapSolutionExample2() {
        assertThat(taskMapSolution.removeStones(new int[][]{{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}})).isEqualTo(3);
    }

    @Test
    void removeStonesMapSolutionExample3() {
        assertThat(taskMapSolution.removeStones(new int[][]{{0, 0}})).isEqualTo(0);
    }
}