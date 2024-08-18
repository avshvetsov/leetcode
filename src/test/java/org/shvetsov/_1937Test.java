package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1937Test {

    private static _1937 task;

    @BeforeEach
    public void setup() {
        task = new _1937();
    }

    @Test
    void maxPointsExample1() {
        assertThat(task.maxPoints(new int[][]{{1, 2, 3}, {1, 5, 1}, {3, 1, 1}})).isEqualTo(9);
    }

    @Test
    void maxPointsExample2() {
        assertThat(task.maxPoints(new int[][]{{1, 5}, {2, 3}, {4, 2}})).isEqualTo(11);
    }
}