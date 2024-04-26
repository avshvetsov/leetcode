package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1289Test {

    private static _1289 task;

    @BeforeEach
    public void setup() {
        task = new _1289();
    }

    @Test
    void minFallingPathSum() {
        assertThat(task.minFallingPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})).isEqualTo(13);
        assertThat(task.minFallingPathSum(new int[][]{{7}})).isEqualTo(7);
    }
}