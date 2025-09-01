package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class _1792Test {

    private _1792 task;

    @BeforeEach
    public void setup() {
        this.task = new _1792();
    }

    @Test
    void maxAverageRatioExample1() {
        assertThat(task.maxAverageRatio(new int[][]{{1, 2}, {3, 5}, {2, 2}}, 2)).isCloseTo(0.78333, within(0.00001));
    }

    @Test
    void maxAverageRatioExample2() {
        assertThat(task.maxAverageRatio(new int[][]{{2, 4}, {3, 9}, {4, 5}, {2, 10}}, 4)).isCloseTo(0.78333, within(0.00001));
    }
}