package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _834Test {

    private static _834 task;

    @BeforeEach
    public void setup() {
        task = new _834();
    }

    @Test
    void sumOfDistancesInTree() {
        assertThat(task.sumOfDistancesInTree(6, new int[][]{{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}})).isEqualTo(new int[]{8, 12, 6, 10, 10, 10});
        assertThat(task.sumOfDistancesInTree(1, new int[][]{})).isEqualTo(new int[]{0});
        assertThat(task.sumOfDistancesInTree(2, new int[][]{{1, 0}})).isEqualTo(new int[]{1, 1});
    }
}