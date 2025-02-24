package org.shvetsov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2467Test {

    private _2467 task;

    @BeforeEach
    public void setup() {
        task = new _2467();
    }

    @Test
    void mostProfitablePathExample1() {
        assertThat(task.mostProfitablePath(new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 4}}, 3, new int[]{-2, 4, 2, -4, 6})).isEqualTo(6);
    }

    @Test
    void mostProfitablePathExample2() {
        assertThat(task.mostProfitablePath(new int[][]{{0, 1}}, 1, new int[]{-7280, 2350})).isEqualTo(-7280);
    }

}